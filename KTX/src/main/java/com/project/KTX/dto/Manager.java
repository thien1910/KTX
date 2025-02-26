package com.project.KTX.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor // khoi tao ko tham so
@AllArgsConstructor
@Getter
@Setter
public class Manager {

    private String user_id;

    private String department;
}
