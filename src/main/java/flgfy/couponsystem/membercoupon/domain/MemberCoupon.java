package flgfy.couponsystem.membercoupon.domain;

import flgfy.couponsystem.coupon.domain.Coupon;
import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Entity
public class MemberCoupon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Coupon coupon;

    private boolean used = false;

    private LocalDateTime issuedAt;
    private LocalDateTime usedAt;

    public void markAsUsed() {
        if (this.used) throw new IllegalStateException("Coupon already used");
        this.used = true;
        this.usedAt = LocalDateTime.now();
    }

    public MemberCoupon(Long memberId, Coupon coupon) {
        this.memberId = memberId;
        this.coupon = coupon;
        this.issuedAt = LocalDateTime.now();
    }

    protected MemberCoupon() {}

}
