package com.testAutomationCoach.abstraccion;

public class EjemploPerro {
    public static void main(String[] args) {
        Perro fido = new Perro();
        fido.nombre = "Fido";
        fido.raza = "Gran Danes";
        fido.tamanio = 45.0;

        fido.ladrar();
        fido.correr();
        fido.comer();
    }
}
