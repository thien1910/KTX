package com.project.KTX.dto;

import com.project.KTX.Enum.Gender;
import com.project.KTX.Enum.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor


public class UserDto {
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
}
