package com.softtek.persistencia.ej6;

import com.softtek.modelo.ej6.Cliente;

public class AccesoProduccion implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Insertando en produccion a "+c1.getNIF();
    }

    public AccesoProduccion() {
    }
}
