package com.softtek.modelo.ej1;

public class Pajaro extends Animal{


    @Override
    public String comer() {
        return "Pajaro come";
    }

    @Override
    public String moverse() {
        return "Pajaro se mueve";
    }

    public Pajaro() {
    }
}
