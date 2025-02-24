package com.project.KTX.dto;

import com.project.KTX.entity.Bill;
import com.project.KTX.entity.RoomService;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor

public class BillDetailDto {

    private String bill_id;
    private String roomService_id;

    private Integer quantity;
    private BigDecimal totalPrice;
}
