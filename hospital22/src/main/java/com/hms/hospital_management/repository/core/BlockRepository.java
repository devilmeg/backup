package com.hms.hospital_management.repository.core;

import com.hms.hospital_management.entity.Block;
import com.hms.hospital_management.entity.Block_Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, Block_Id> {
}