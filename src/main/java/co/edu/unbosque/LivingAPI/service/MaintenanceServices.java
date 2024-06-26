package co.edu.unbosque.LivingAPI.service;

import co.edu.unbosque.LivingAPI.exception.MaintenanceNotFoundException;
import co.edu.unbosque.LivingAPI.model.dto.ServiceDTO;
import co.edu.unbosque.LivingAPI.repository.MaintenanceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceServices {

    public final MaintenanceRepository maintenanceRepository;

    public MaintenanceServices(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public ServiceDTO searchMaintenanceByID(Integer id) {
        ModelMapper modelMapper = new ModelMapper();
        return maintenanceRepository.findById(id).map(entity -> modelMapper.map(entity, ServiceDTO.class))
                .orElseThrow(()-> new MaintenanceNotFoundException("Maintenance not found"));
    }

}
