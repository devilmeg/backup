package com.hms.hospital_management.dto.response;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientAppointmentDTO {

    private LocalDateTime appointmentDate;
    private String physicianName;
}