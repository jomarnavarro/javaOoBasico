package com.testAutomationCoach.bVariables;

import com.testAutomationCoach.aAbstraccion.Cancion;

public class AsignacionReferencia {
    public static void main(String[] args) {
        //cuantas referencias hay? cuantos objetos?
        Cancion elTriste = new Cancion();
        Cancion almohada = new Cancion();
        Cancion x = elTriste;
        Cancion y = new Cancion();
        y = almohada;
        elTriste = null;
        x = elTriste;
    }
}
