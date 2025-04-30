package flgfy.couponsystem.coupon.service;

import flgfy.couponsystem.coupon.domain.Coupon;
import flgfy.couponsystem.coupon.domain.CouponType;
import flgfy.couponsystem.coupon.repository.CouponRepository;
import flgfy.couponsystem.membercoupon.domain.MemberCoupon;
import flgfy.couponsystem.membercoupon.repository.MemberCouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository couponRepository;
    private final MemberCouponRepository memberCouponRepository;

    public void issuePolicyCoupon(Long couponId, Long memberId) {
        Coupon coupon = couponRepository.findById(couponId)
                .orElseThrow(() -> new NoSuchElementException("Coupon not found"));

        if (Objects.equals(coupon.getType(), CouponType.POLICY_250K)) {
            throw new IllegalArgumentException("Not a policy coupon");
        }

        if (coupon.isExpired() || coupon.isOutOfStock()) {
            throw new IllegalStateException("Cannot issue coupon");
        }

        if (memberCouponRepository.existsByMemberIdAndCoupon(memberId, coupon)) {
            throw new IllegalStateException("Already issued");
        }

        coupon.issue(); // issuedCount++
        couponRepository.save(coupon);

        MemberCoupon memberCoupon = new MemberCoupon(memberId, coupon);
        memberCouponRepository.save(memberCoupon);
    }

    public List<Coupon> getPolicyCoupons() {
        return couponRepository.findByType(CouponType.POLICY_250K);
    }
}
