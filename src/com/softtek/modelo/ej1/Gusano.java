package com.softtek.modelo.ej1;

public class Gusano extends Animal{

    @Override
    public String comer() {
        return "Gusano come";
    }

    @Override
    public String moverse() {
        return "Gusano se mueve";
    }

    public Gusano() {
    }
}
