package com.softtek.modelo.ej6;

public class Cliente {

    private String nombre;
    private String NIF;

    public Cliente(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}
