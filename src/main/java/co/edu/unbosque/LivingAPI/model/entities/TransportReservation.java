package co.edu.unbosque.LivingAPI.model.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "")
public class TransportReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Service service;
    @Column
    private LocalDateTime startDateTime;
    @Column
    private LocalDateTime endDateTime;
    @Column
    private int duration;
    @Column
    private String status;

    public TransportReservation() {
    }

    public TransportReservation(int id, Service service, LocalDateTime startDateTime, LocalDateTime endDateTime, int duration, String status) {
        this.id = id;
        this.service = service;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.duration = duration;
        this.status = status;
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

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TransportReservation{" +
                "id=" + id +
                ", service=" + service +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}
