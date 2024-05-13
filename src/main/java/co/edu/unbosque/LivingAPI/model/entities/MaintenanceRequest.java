package co.edu.unbosque.LivingAPI.model.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "")
public class MaintenanceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Service service;
    @Column(name = "")
    private String maintenancetype;
    @Column(name = "")
    private Date date;
    @Column(name = "")
    private String status;

    public MaintenanceRequest() {
    }

    public MaintenanceRequest(int id, Service service, String maintenancetype, Date date, String status) {
        this.id = id;
        this.service = service;
        this.maintenancetype = maintenancetype;
        this.date = date;
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

    public String getMaintenancetype() {
        return maintenancetype;
    }

    public void setMaintenancetype(String maintenancetype) {
        this.maintenancetype = maintenancetype;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MaintenanceRequest{" +
                "id=" + id +
                ", service=" + service +
                ", maintenancetype='" + maintenancetype + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
