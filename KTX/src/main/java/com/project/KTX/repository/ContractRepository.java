package com.project.KTX.repository;

import com.project.KTX.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, String> {
}
