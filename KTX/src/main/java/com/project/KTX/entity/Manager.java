package com.project.KTX.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    @Id
    private String managerId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String department;
    private Date createsAt;
    private Date updatedAt;

}
