package com.softtek.modelo.ej1;

public class Perro extends Animal{


    @Override
    public String comer() {
        return "Perro come";
    }

    @Override
    public String moverse() {
        return "Perro se mueve";
    }

    public Perro() {
    }
}
