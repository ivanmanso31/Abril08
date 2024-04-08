package com.softtek.modelo.ej2;

public class Avion extends Vehiculo implements ObjetoVolador{
    @Override
    public String despegar() {
        return "Avion despega";
    }

    @Override
    public String aterrizar() {
        return "Avion aterriza";
    }

    @Override
    public String volar() {
        return "Avion vuela";
    }

    public Avion() {
        super();
    }
}
