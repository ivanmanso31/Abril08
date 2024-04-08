package com.softtek.modelo.ej1;

public class Gorrion extends Pajaro{

    @Override
    public String comer() {
        return "Gorrion come";
    }

    @Override
    public String moverse() {
        return "Gorrion se mueve";
    }

    public Gorrion() {
        super();
    }
}
