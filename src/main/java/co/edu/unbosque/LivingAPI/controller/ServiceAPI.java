package co.edu.unbosque.LivingAPI.controller;

import co.edu.unbosque.LivingAPI.model.dto.MaintenanceDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/service/api")
public interface ServiceAPI {

    @GetMapping("/maintenance/{id}")
    ResponseEntity<MaintenanceDTO> getMaintenance(@PathVariable Integer id);

    @GetMapping("/maintenance")
    ResponseEntity<MaintenanceDTO> getMaintenance();

    @PostMapping("/maintenance")
    ResponseEntity<MaintenanceDTO> createMaintenance(@RequestBody MaintenanceDTO maintenanceDTO);

}
