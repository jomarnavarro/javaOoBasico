package com.testAutomationCoach.eHerencia.animals;

public class EjemploAnimales {

    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.hacerRuido();
        ani.dormir();
        //etc

        Leon rey = new Leon();
        rey.hacerRuido();
        rey.dormir();

        //polyAnimal
        Animal chicoBestia = new Gato();
        chicoBestia.hacerRuido();
        chicoBestia.comer();

        chicoBestia = new Perro();
        chicoBestia.hacerRuido();
        chicoBestia.comer();

        Animal[] zoologico = new Animal[5];
        zoologico[0] = new Leon();
        zoologico[1] = new Jaguar();
        zoologico[2] = new Hipopotamo();
        zoologico[3] = new Lobo();
        zoologico[4] = new Puma();

        for(Animal poly: zoologico) {
            poly.hacerRuido();
            poly.comer();
            //poly.recorrerTerreno();
        }

    }
}
