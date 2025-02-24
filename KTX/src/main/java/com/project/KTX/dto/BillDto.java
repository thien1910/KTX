package com.project.KTX.dto;

import com.project.KTX.Enum.BillStatus;
import com.project.KTX.Enum.PaymentMethod;
import com.project.KTX.entity.Contract;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor

public class BillDto {
    @NotNull(message = "Contract is required")
    private String contract_id;
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
