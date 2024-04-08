package com.softtek.modelo.ej2;

public class Barcaza extends Vehiculo implements Nautico{

    @Override
    public String atracar() {
        return "Barcaza atraca";
    }

    @Override
    public String navegar() {
        return "Barcaza navega";
    }

    public Barcaza() {
        super();
    }
}
