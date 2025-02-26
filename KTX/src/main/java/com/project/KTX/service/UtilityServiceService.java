package com.project.KTX.service;

import com.project.KTX.dto.UtilityServiceDto;
import com.project.KTX.entity.UtilityService;
import com.project.KTX.repository.UtilityServiceRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtilityServiceService {
    @Autowired
    private UtilityServiceRepository utilityServiceRepository;

    // Tạo mới dịch vụ
    public UtilityService createUtilityService(UtilityServiceDto utilityServiceDto) {
        UtilityService utilityService = new UtilityService();
        if (utilityServiceRepository.existByUtilityServiceName(utilityServiceDto.getServiceName()))
            throw new RuntimeException("Service existed");
        utilityService.setUtilityServiceName(utilityService.getUtilityServiceName());
        utilityService.setDescription(utilityService.getDescription());
        utilityService.setPricePerUnit(utilityService.getPricePerUnit());
        utilityService.setStatus(utilityService.getStatus());
        return  utilityServiceRepository.save(utilityService);

    }

    public List<UtilityService> getAllServices() {
        return utilityServiceRepository.findAll();
    }

    // Lấy dịch vụ theo ID
    public Optional<UtilityService> getServiceById(Long id) {
        return utilityServiceRepository.findById(id);
    }

    // Cập nhật dịch vụ
    public UtilityService updateService(Long id, UtilityServiceDto serviceDto) {
        return utilityServiceRepository.findById(id).map(service -> {
            service.setUtilityServiceName(serviceDto.getServiceName());
            service.setDescription(serviceDto.getDescription());
            service.setPricePerUnit(serviceDto.getPricePerUnit());
            service.setStatus(serviceDto.getStatus());
            return utilityServiceRepository.save(service);
        }).orElseThrow(() -> new RuntimeException("Service not found"));
    }

    // Xóa dịch vụ
    public void deleteService(Long id) {
        if (!utilityServiceRepository.existsById(id)) {
            throw new RuntimeException("Service not found");
        }
        utilityServiceRepository.deleteById(id);
    }
}
