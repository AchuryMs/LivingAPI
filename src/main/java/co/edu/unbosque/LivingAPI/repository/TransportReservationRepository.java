package co.edu.unbosque.LivingAPI.repository;

import co.edu.unbosque.LivingAPI.model.entities.TransportReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportReservationRepository extends JpaRepository<TransportReservation, Integer> {
}
