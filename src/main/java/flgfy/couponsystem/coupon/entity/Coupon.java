package flgfy.couponsystem.coupon.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * 관리자
 */
@Entity
public class Coupon {
    @Id @GeneratedValue
    private Long id;

    private String code; // 쿠폰 번호

    @Enumerated(EnumType.STRING) // 또는 EnumType.ORDINAL
    @Column(nullable = false)
    private CouponType type;


    private LocalDateTime createdAt; // 생성 일시
    private LocalDateTime expiresAt; // 유효 기간

    private int totalQty;  // 발급 총량
    private int issuedQty; // 현재 발급된 수량

}
