package com.hms.hospital_management.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrescriptionDTO {

    private String medicationName;
    private String brand;
    private String dose;
    private String physicianName;
}