package co.edu.unbosque.LivingAPI.controller;

import co.edu.unbosque.LivingAPI.model.dto.ServiceDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/maintenance/api")
public interface MaintenanceAPI {

    @GetMapping("/maintenance/{id}")
    ResponseEntity<ServiceDTO> getMaintenance(@PathVariable Integer id);

    @GetMapping("/maintenance")
    ResponseEntity<ServiceDTO> getMaintenance();

    @PostMapping("/maintenance")
    ResponseEntity<ServiceDTO> createMaintenance(@RequestBody ServiceDTO maintenanceDTO);
}