package co.edu.unbosque.LivingAPI.model.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
