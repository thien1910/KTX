package com.project.KTX.dto;

import com.project.KTX.Enum.ContractStatus;
import com.project.KTX.Enum.DepositStatus;
import com.project.KTX.entity.Room;
import com.project.KTX.entity.Student;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor
@Getter
@Setter
public class ContractDto {
    private String student_id;
    private String room_id;
    private Date startDate;
    private Date endDate;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private DepositStatus depositStatus;
    @Enumerated(EnumType.STRING)
    private ContractStatus contractStatus;
    private String note;
}
