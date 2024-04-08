package com.softtek.modelo.ej2;

public class Helicoptero extends Avion{

    @Override
    public String despegar() {
        return "Helicoptero despega";
    }

    @Override
    public String aterrizar() {
        return "Helicoptero aterriza";
    }

    @Override
    public String volar() {
        return "Helicoptero vuela";
    }

    public Helicoptero() {
        super();
    }
}
