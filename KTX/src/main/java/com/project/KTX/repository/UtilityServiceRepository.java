package com.project.KTX.repository;

import com.project.KTX.entity.UtilityService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityServiceRepository extends JpaRepository<UtilityService, Long> {
    boolean existByUtilityServiceName(String utilityServiceName);
}
