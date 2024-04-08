package com.softtek.presentacion;

import com.softtek.modelo.ej6.Cliente;
import com.softtek.persistencia.ej6.AccesoDesarrollo;
import com.softtek.persistencia.ej6.AccesoProduccion;
import com.softtek.persistencia.ej6.ClienteDAO;
import com.softtek.persistencia.ej6.IDAO;

public class PruebaEj6 {

    public static void main(String[] args) {
        IDAO dao1= new AccesoDesarrollo();
        IDAO dao2= new AccesoProduccion();
        Cliente c1= new Cliente("Juan","12A");
        ClienteDAO cdao1= new ClienteDAO(dao1);
        ClienteDAO cdao2= new ClienteDAO(dao2);
        System.out.println(cdao1.insertar(c1));
        System.out.println(cdao2.insertar(c1));
    }
}
