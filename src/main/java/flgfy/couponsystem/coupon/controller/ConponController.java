package flgfy.couponsystem.coupon.controller;

import flgfy.couponsystem.coupon.domain.Coupon;
import flgfy.couponsystem.coupon.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupons")
@RequiredArgsConstructor
public class ConponController {
    private final CouponService couponService;

    @PostMapping("/{couponId}/issue/policy")
    public ResponseEntity<String> issuePolicyCoupon(@PathVariable Long couponId,
                                                    @RequestParam Long memberId) {
        couponService.issuePolicyCoupon(couponId, memberId);
        return ResponseEntity.ok("Policy coupon issued successfully");
    }

    @GetMapping("/policy")
    public ResponseEntity<List<Coupon>> getPolicyCoupons() {
        return ResponseEntity.ok(couponService.getPolicyCoupons());
    }
}

/**
    테스트 순서
    1. 쿠폰을 POLICY_250K 타입으로 등록
    2. /coupons/policy → 정책 쿠폰 조회
    3. /coupons/{id}/issue/policy?memberId=1 → 발급 요청
 */