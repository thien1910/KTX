package com.project.KTX.repository;

import com.project.KTX.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, String> {
}
