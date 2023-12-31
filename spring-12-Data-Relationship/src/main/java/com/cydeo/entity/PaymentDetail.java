package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "paymentDetails")
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal commissionAmount;
    private BigDecimal merchantPayoutAmount;

    @OneToOne(mappedBy = "paymentDetail")
    private Payment payment;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    public PaymentDetail(BigDecimal commissionAmount, BigDecimal merchantPayoutAmount, LocalDate payoutDate) {
        this.commissionAmount = commissionAmount;
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.payoutDate = payoutDate;
    }
}
