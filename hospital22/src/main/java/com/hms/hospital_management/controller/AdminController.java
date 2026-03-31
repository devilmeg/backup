package com.hms.hospital_management.controller;

import com.hms.hospital_management.constants.*;
import com.hms.hospital_management.dto.response.*;
import com.hms.hospital_management.service.AdminService;
import com.hms.hospital_management.dto.response.ApiResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiPaths.ADMIN)
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping(ApiPaths.REPORTS + ApiPaths.REVENUE)
    public ResponseEntity<ApiResponse<List<RevenueDTO>>> getRevenue() {

        return ResponseEntity.ok(
                new ApiResponse<>(AppConstants.SUCCESS, AppConstants.DATA_FETCHED,
                        adminService.getRevenue())
        );
    }

    @GetMapping(ApiPaths.STAFF + ApiPaths.STAFF_ALL)
    public ResponseEntity<ApiResponse<List<StaffDTO>>> getAllStaff() {

        return ResponseEntity.ok(
                new ApiResponse<>(AppConstants.SUCCESS, AppConstants.DATA_FETCHED,
                        adminService.getAllStaff())
        );
    }
}