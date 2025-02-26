package com.project.KTX.dto;

import com.project.KTX.Enum.ContractStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor
@Getter
@Setter
public class UtilityServiceDto {
    private String serviceName;
    private String description;
    private BigDecimal pricePerUnit;
    private String calculationUnit;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

}
