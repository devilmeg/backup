package com.hms.hospital_management.controller;

import com.hms.hospital_management.constants.*;
import com.hms.hospital_management.dto.response.*;
import com.hms.hospital_management.service.DoctorService;
import com.hms.hospital_management.dto.response.ApiResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiPaths.PHYSICIANS)
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping(ApiPaths.DOCTOR_PATIENTS)
    public ResponseEntity<ApiResponse<List<DoctorPatientDTO>>> getDoctorPatients(@PathVariable Integer id) {

        return ResponseEntity.ok(
                new ApiResponse<>(AppConstants.SUCCESS, AppConstants.DATA_FETCHED,
                        doctorService.getPatients(id))
        );
    }

    @GetMapping(ApiPaths.DOCTOR_APPOINTMENTS_TODAY)
    public ResponseEntity<ApiResponse<List<DoctorAppointmentDTO>>> getTodayAppointments(@PathVariable Integer id) {

        return ResponseEntity.ok(
                new ApiResponse<>(AppConstants.SUCCESS, AppConstants.DATA_FETCHED,
                        doctorService.getTodayAppointments(id))
        );
    }

    @GetMapping(ApiPaths.DOCTOR_PROCEDURES)
    public ResponseEntity<ApiResponse<List<DoctorProcedureDTO>>> getProcedures(@PathVariable Integer id) {

        List<DoctorProcedureDTO> data = doctorService.getTrainedProcedures(id);

        String message = data.isEmpty()
                ? "No procedures found"
                : AppConstants.DATA_FETCHED;

        return ResponseEntity.ok(
                new ApiResponse<>(AppConstants.SUCCESS, message, data)
        );
    }
}