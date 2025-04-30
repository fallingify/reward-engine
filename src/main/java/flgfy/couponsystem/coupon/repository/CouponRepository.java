package flgfy.couponsystem.coupon.repository;

import flgfy.couponsystem.coupon.domain.Coupon;
import flgfy.couponsystem.coupon.domain.CouponType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
    List<Coupon> findByType(CouponType type);
}
