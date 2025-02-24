package com.project.KTX.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomServiceId;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    private BigDecimal price;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
