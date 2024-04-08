package com.softtek.modelo.ej5;

public class Director implements Empleado{

    private IInforme informe;

    @Override
    public String getTareas() {
        return "Tareas";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Director(IInforme informe) {
        this.informe = informe;
    }

    public Director() {
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
