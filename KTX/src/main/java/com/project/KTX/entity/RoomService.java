package com.project.KTX.entity;

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
public class RoomService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomServiceId;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private UtilityService service;

    private BigDecimal price;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
