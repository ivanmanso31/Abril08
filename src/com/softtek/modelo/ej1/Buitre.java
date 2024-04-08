package com.softtek.modelo.ej1;

public class Buitre extends Pajaro{

    @Override
    public String comer() {
        return "Buitre come";
    }

    @Override
    public String moverse() {
        return "Buitre se mueve";
    }

    public Buitre() {
        super();
    }
}
