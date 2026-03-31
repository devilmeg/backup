package com.hms.hospital_management.repository.core;

import com.hms.hospital_management.entity.Stay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StayRepository extends JpaRepository<Stay, Integer> {
}