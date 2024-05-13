package co.edu.unbosque.LivingAPI.repository;

import co.edu.unbosque.LivingAPI.model.entities.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainteinanceRequestRepository extends JpaRepository<MaintenanceRequest, Integer> {
}
