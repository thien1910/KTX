package com.project.KTX.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor

public class StudentDto {
    private String userId;
    private String maSinhVien;
}
