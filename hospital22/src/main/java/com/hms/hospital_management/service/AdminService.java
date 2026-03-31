package com.hms.hospital_management.service;

import com.hms.hospital_management.dto.response.*;

import java.util.List;

public interface AdminService {

    List<RevenueDTO> getRevenue();

    List<StaffDTO> getAllStaff();
}