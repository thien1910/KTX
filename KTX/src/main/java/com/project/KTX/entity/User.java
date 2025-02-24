package com.project.KTX.entity;

import com.project.KTX.Enum.Gender;
import com.project.KTX.Enum.Status;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String userName;
    private String passWord;
    private String fullName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String cccd;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String country;
    private Date createdAt;
    private Date updatedAt;

}
