package co.edu.unbosque.LivingAPI.repository;

import co.edu.unbosque.LivingAPI.model.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepository extends JpaRepository <Service, Integer> {
}
