package com.softtek.modelo.ej1;

public class Pez extends Animal{


    @Override
    public String comer() {
        return "Pez come";
    }

    @Override
    public String moverse() {
        return "Pez se mueve";
    }

    public Pez() {
    }
}
