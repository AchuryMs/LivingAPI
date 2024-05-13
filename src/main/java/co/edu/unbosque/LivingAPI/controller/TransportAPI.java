package co.edu.unbosque.LivingAPI.controller;

import co.edu.unbosque.LivingAPI.model.dto.ServiceDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/transport/api")
public interface TransportAPI {

    @GetMapping("/transport/{id}")
    ResponseEntity<ServiceDTO> getMaintenance(@PathVariable Integer id);

    @GetMapping("/transport")
    ResponseEntity<ServiceDTO> getMaintenance();

    @PostMapping("/transport")
    ResponseEntity<ServiceDTO> createMaintenance(@RequestBody ServiceDTO maintenanceDTO);

    @PutMapping("/transport")
    ResponseEntity<ServiceDTO> updateMaintenance(@RequestBody ServiceDTO maintenanceDTO);
}
