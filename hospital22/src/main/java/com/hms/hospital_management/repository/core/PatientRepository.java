package com.hms.hospital_management.repository.core;

import com.hms.hospital_management.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}