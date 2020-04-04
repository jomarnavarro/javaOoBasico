package com.testAutomationCoach.cMethods;

import com.testAutomationCoach.aAbstraccion.Perro;

public class EjemploPerroB {
    public static void main(String[] args) {
        PerroB marmaduke = new PerroB();
        marmaduke.tamanio = 60.1;
        marmaduke.ladrar();

        PerroB pastorAleman = new PerroB();
        pastorAleman.tamanio = 45.9;
        pastorAleman.ladrar();

        PerroB pug = new PerroB();
        pug.tamanio = 15.0;
        pug.ladrar();

        pug.ladrar(10);
    }
}
