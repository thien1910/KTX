package com.project.KTX.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor
@Getter
@Setter
public class StudentDto {
    private String userId;
    private String maSinhVien;
}
