package com.softtek.modelo.ej4;

public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "Pintando";
    }

    public TallerPintura() {
    }
}
