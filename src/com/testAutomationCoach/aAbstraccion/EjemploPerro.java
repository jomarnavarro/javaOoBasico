package com.testAutomationCoach.aAbstraccion;

public class EjemploPerro {
    public static void main(String[] args) {
        Perro fido = new Perro();
        fido.nombre = "Fido";
        fido.raza = "Gran Danes";
        fido.tamanio = 45.0;

        fido.ladrar();
        fido.correr();
        fido.comer();

        libs.Input.print("Nombre " + fido.nombre + "\n");
        libs.Input.print("Raza " +fido.raza + "\n");
        libs.Input.print("Tamaño " + fido.tamanio + "\n");

    }
}
