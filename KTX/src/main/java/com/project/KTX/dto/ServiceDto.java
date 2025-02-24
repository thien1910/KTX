package com.project.KTX.dto;

import com.project.KTX.Enum.ContractStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor
public class ServiceDto {
    private String serviceName;
    private String description;
    private BigDecimal pricePerUnit;
    private String calculationUnit;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

}
