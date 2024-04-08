package com.softtek.modelo.ej2;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public String atracar() {
        return "Hidroavion atraca";
    }

    @Override
    public String navegar() {
        return "Hidroavion navega";
    }

    @Override
    public String despegar() {
        return "Hidroavion despega";
    }

    @Override
    public String aterrizar() {
        return "Hidroavion aterriza";
    }

    @Override
    public String volar() {
        return "Hidroavion vuela";
    }

    public Hidroavion() {
        super();
    }
}
