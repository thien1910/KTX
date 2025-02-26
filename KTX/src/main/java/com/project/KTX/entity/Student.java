package com.project.KTX.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
