package com.project.KTX.entity;

import com.project.KTX.Enum.RoomStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String roomId;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Manager manager;
    private String roomName;
    private String department;
    private int maximumOccupancy;
    private int currentOccupancy;
    private String roomType;
    private BigDecimal roomPrice;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;

    private String note;
    private Date createsAt;
    private Date updatedAt;


}
