package flgfy.couponsystem.coupon.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Coupon {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CouponType type;

    private int totalCount;

    private int issuedCount = 0;

    private int amount; // 예: 250000

    private LocalDateTime expirationDate;

    public boolean isExpired() {
        return expirationDate != null && expirationDate.isBefore(LocalDateTime.now());
    }

    public boolean isOutOfStock() {
        return issuedCount >= totalCount;
    }

    public void issue() {
        if (isExpired()) throw new IllegalStateException("Coupon expired");
        if (isOutOfStock()) throw new IllegalStateException("Coupon out of stock");
        issuedCount++;
    }

    public boolean getType() {
    }
}
