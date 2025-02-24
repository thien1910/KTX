package com.project.KTX.entity;

import com.project.KTX.Enum.ContractStatus;
import com.project.KTX.Enum.RoomStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceId;

    private String serviceName;
    private String description;
    private BigDecimal pricePerUnit;
    private String calculationUnit;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    private Timestamp createdAt;
    private Timestamp updatedAt;
}
