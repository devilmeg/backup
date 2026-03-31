package com.hms.hospital_management.repository.core;

import com.hms.hospital_management.dto.response.StaffDTO;
import com.hms.hospital_management.entity.Physician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

}