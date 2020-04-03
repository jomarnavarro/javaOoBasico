package com.testAutomationCoach.bVariables;

import com.testAutomationCoach.aAbstraccion.Articulo;
import com.testAutomationCoach.aAbstraccion.Perro;

public class Instanciacion {

    static Perro fido;
    static Articulo tablet;
    static int numeroEstudiantes;

    public static void main(String[] args) {
        //cuanta memoria ocupan estas variables?
        char x = 'N';
        int numeroTotalEstudiantes = numeroEstudiantes + 3;
        String saludo = "Hola";
        String fraseBenito = "El respeto al derecho ajeno es la paz";

        Perro firulais = new Perro();
        fido.ladrar();
        firulais.ladrar();
        tablet.toString();
        Articulo laptop = new Articulo();
        laptop.toString();
    }
}
