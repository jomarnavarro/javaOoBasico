package com.testAutomationCoach.cMethods;

public class PerroB {
    //variables de instancia, tamano, raza, nombre
    public double tamanio;
    public String raza;
    public String nombre;

    //comportamiento: ladrar, juguetear, comer, etc.

    public void ladrar() {
        if(tamanio > 60.0) {
            libs.Input.print("woof, woof!\n");
        } else if( tamanio > 20 ) {
            libs.Input.print("guau, guau!\n");
        } else {
            libs.Input.print("yip, yip!\n");
        }
    }

    public void ladrar(int numLadridos) {
        for(int i = 0; i < numLadridos; i++) {
            ladrar();
        }
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
