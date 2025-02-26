package com.project.KTX.entity;

import com.project.KTX.Enum.ContractStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UtilityService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer utilityServiceId;

    private String utilityServiceName;
    private String description;
    private BigDecimal pricePerUnit;
    private String calculationUnit;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    private Timestamp createdAt;
    private Timestamp updatedAt;
}
