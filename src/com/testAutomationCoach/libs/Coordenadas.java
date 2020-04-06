package com.testAutomationCoach.libs;

public class Coordenadas {
    public double longitud;
    public double latitud;

    public Coordenadas(double longit, double lat) {
        this.longitud = longit;
        this.latitud = lat;
    }

    public Coordenadas darUbicagion() {
        return new Coordenadas(0.0, 0.0);

    }

}
