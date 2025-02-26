package com.project.KTX.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor
@Getter
@Setter
public class RoomServiceDto {
    private String room_id;
    private String service_id;
    private BigDecimal price;
}
