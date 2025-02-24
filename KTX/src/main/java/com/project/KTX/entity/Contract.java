package com.project.KTX.entity;

import com.project.KTX.Enum.ContractStatus;
import com.project.KTX.Enum.DepositStatus;
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
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String contractId;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
    private Date startDate;
    private Date endDate;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private DepositStatus depositStatus;

    @Enumerated(EnumType.STRING)
    private ContractStatus contractStatus;

    private String note;
    private Date createsAt;
    private Date updatedAt;

}
