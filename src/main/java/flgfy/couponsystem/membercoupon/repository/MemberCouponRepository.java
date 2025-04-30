package flgfy.couponsystem.membercoupon.repository;

import flgfy.couponsystem.coupon.domain.Coupon;
import flgfy.couponsystem.membercoupon.domain.MemberCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberCouponRepository extends JpaRepository<MemberCoupon, Long> {
    //쿠폰과 사용자 검사
    boolean existsByMemberIdAndCoupon(Long memberId, Coupon coupon);
}
