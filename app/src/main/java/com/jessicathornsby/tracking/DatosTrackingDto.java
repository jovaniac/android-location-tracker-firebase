package com.jessicathornsby.tracking;

import android.location.Location;

public class DatosTrackingDto {

    private Location location;
    private String idDispositivo;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }
}
