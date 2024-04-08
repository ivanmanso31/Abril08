package com.softtek.modelo.ej4;

public class TallerMecanica implements ITaller{


    @Override
    public String reparar(Coche c) {
        return "Reparando";
    }

    public TallerMecanica() {
    }
}
