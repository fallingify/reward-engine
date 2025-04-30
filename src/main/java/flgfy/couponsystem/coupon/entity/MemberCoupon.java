package flgfy.couponsystem.coupon.entity;

import flgfy.couponsystem.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class MemberCoupon {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Coupon coupon;

    private boolean used; // 사용 여부

    private LocalDateTime issuedAt;
    private LocalDateTime usedAt;
}
