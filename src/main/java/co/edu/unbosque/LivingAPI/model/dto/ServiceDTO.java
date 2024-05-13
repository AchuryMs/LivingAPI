package co.edu.unbosque.LivingAPI.model.dto;

import jakarta.persistence.Column;

import java.util.Date;

public class ServiceDTO {

    private int id;
    private String type;
    private Date startDate;
    private Date endDate;
    private String status;
    private String providerId;

    public ServiceDTO() {
    }

    public ServiceDTO(int id, String type, Date startDate, Date endDate, String status, String providerId) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.providerId = providerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "ServiceDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                ", providerId='" + providerId + '\'' +
                '}';
    }
}
