package co.edu.unbosque.LivingAPI.model.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
