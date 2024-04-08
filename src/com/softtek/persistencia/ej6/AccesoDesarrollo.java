package com.softtek.persistencia.ej6;

import com.softtek.modelo.ej6.Cliente;

public class AccesoDesarrollo implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Insertando a "+c1.getNIF();
    }

    public AccesoDesarrollo() {
    }
}
