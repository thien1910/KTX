package com.project.KTX.dto;

import com.project.KTX.Enum.RoomStatus;
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

public class RoomDto {
    private String managerId;
    private String roomName;
    private String department;
    private int maximumOccupancy;
    private int currentOccupancy;
    private String roomType;
    private BigDecimal roomPrice;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;

    private String note;
}
