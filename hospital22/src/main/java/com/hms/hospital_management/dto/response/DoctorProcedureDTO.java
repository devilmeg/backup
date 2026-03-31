package com.hms.hospital_management.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorProcedureDTO {

    private String procedureName;
    private Double cost;
}