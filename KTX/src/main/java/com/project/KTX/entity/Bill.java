package com.project.KTX.entity;

import com.project.KTX.Enum.BillStatus;
import com.project.KTX.Enum.PaymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String billId;

    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;
    private BigDecimal sumPrice;
    private java.sql.Date paymentDate;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private BillStatus billStatus;
    private String note;
    private Date createdAt;
    private Date updatedAt;

}
