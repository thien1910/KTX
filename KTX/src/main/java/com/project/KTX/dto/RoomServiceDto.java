package com.project.KTX.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor

public class RoomServiceDto {
    private String room_id;
    private String service_id;
    private BigDecimal price;
}
