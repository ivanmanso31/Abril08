package com.softtek.persistencia.ej6;

import com.softtek.modelo.ej6.Cliente;

public class ClienteDAO {

    private IDAO conexion;

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public ClienteDAO() {
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
