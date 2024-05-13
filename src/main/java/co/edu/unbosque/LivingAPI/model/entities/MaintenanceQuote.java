package co.edu.unbosque.LivingAPI.model.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "")
public class MaintenanceQuote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Service service;
    @Column
    private LocalDateTime date;
    @Column(name = "")
    private String status;
    @Column
    private LocalDateTime createdIn;

    public MaintenanceQuote() {
    }

    public MaintenanceQuote(int id, Service service, LocalDateTime date, String status, LocalDateTime createdIn) {
        this.id = id;
        this.service = service;
        this.date = date;
        this.status = status;
        this.createdIn = createdIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(LocalDateTime createdIn) {
        this.createdIn = createdIn;
    }

    @Override
    public String toString() {
        return "MaintenanceQuote{" +
                "id=" + id +
                ", service=" + service +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", createdIn=" + createdIn +
                '}';
    }
}
