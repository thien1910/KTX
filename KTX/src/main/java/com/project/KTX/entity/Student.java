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
public class Student {
    @Id
    private String studentId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;

    private String maSinhVien;
    private Date createsAt;
    private Date updatedAt;

}
