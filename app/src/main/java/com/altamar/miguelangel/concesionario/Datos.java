package com.altamar.miguelangel.concesionario;

import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by miguelal on 21/09/2015.
 */
public class Datos {
    private static ArrayList<Carro> lista = new ArrayList<Carro>();

    public static void guardar(Carro o) {
        lista.add(o);
    }

    public static ArrayList<Carro> getCarros() {
        return lista;
    }
}
