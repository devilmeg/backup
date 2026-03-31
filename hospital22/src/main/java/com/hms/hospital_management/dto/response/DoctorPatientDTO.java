package com.hms.hospital_management.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorPatientDTO {

    private Integer patientSSN;
    private String patientName;


}