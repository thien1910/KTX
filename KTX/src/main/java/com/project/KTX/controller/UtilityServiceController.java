package com.project.KTX.controller;

import com.project.KTX.dto.UtilityServiceDto;
import com.project.KTX.entity.UtilityService;
import com.project.KTX.service.UtilityServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/utility-service")
public class UtilityServiceController {

    @Autowired
    private UtilityServiceService utilityServiceService;

    // Tạo mới dịch vụ
    @PostMapping("/create")
    public ResponseEntity<UtilityService> createService(@RequestBody UtilityServiceDto utilityServiceDto) {
        UtilityService createdService = utilityServiceService.createUtilityService(utilityServiceDto);
        return ResponseEntity.ok(createdService);
    }

    // Lấy tất cả dịch vụ
    @GetMapping("/all")
    public ResponseEntity<List<UtilityService>> getAllServices() {
        List<UtilityService> services = utilityServiceService.getAllServices();
        return ResponseEntity.ok(services);
    }

    // Lấy dịch vụ theo ID
    @GetMapping("/{id}")
    public ResponseEntity<UtilityService> getServiceById(@PathVariable Long id) {
        Optional<UtilityService> service = utilityServiceService.getServiceById(id);
        return service.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Cập nhật dịch vụ
    @PutMapping("/update/{id}")
    public ResponseEntity<UtilityService> updateService(@PathVariable Long id, @RequestBody UtilityServiceDto serviceDto) {
        try {
            UtilityService updatedService = utilityServiceService.updateService(id, serviceDto);
            return ResponseEntity.ok(updatedService);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Xóa dịch vụ
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        try {
            utilityServiceService.deleteService(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}