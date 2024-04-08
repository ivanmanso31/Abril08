package com.softtek.modelo.ej5;

public class Jefe implements Empleado{

    private IInforme informe;


    @Override
    public String getTareas() {
        return "Tareas";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
