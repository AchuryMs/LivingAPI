package co.edu.unbosque.LivingAPI.model.dto;

import co.edu.unbosque.LivingAPI.model.entities.Service;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class MaintenanceQuoteDTO {
    private int id;
    private Service service;
    private LocalDateTime date;
    private String status;
    private LocalDateTime createdIn;

    public MaintenanceQuoteDTO() {
    }

    public MaintenanceQuoteDTO(int id, Service service, LocalDateTime date, String status, LocalDateTime createdIn) {
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
        return "MaintenanceQuoteDTO{" +
                "id=" + id +
                ", service=" + service +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", createdIn=" + createdIn +
                '}';
    }
}
