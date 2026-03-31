package com.hms.hospital_management.repository.core;

import com.hms.hospital_management.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {

    List<Room> findByUnavailableTrue();
}
