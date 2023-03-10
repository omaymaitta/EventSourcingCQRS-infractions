package com.example.commonapi.events;

import java.util.Date;

public class InfractionCreatedEvent extends BaseEvent<String> {
    private Date date;
    private double montant;
    private String vehiculeId;
    private String radarId;

    public InfractionCreatedEvent(String id, Date date, double montant, String vehiculeId, String radarId) {
        super(id);
        this.date = date;
        this.montant = montant;
        this.vehiculeId = vehiculeId;
        this.radarId = radarId;
    }

    public Date getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public String getVehiculeId() {
        return vehiculeId;
    }

    public String getRadarId() {
        return radarId;
    }
}
