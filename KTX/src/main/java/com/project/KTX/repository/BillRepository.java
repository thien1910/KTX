package com.project.KTX.repository;

import com.project.KTX.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, String> {
}
