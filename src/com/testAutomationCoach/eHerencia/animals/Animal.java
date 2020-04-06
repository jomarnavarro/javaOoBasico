package com.testAutomationCoach.eHerencia.animals;

import com.testAutomationCoach.libs.Coordenadas;

import java.io.File;

public class Animal {
	private File picture;
	private char comida; //Carne o Vegetales o ambos
	private int nivelHambre; //1-100
	private String habitat; //selva, bosque, desierto, etc.
	private Coordenadas location;
	
	public void hacerRuido() {}
	public void comer() {}
	public void dormir() {}
	public void recorrerTerreno() {}

	public static class Canino extends Animal {

		public void recorrerTerreno() {}
	}

	public static class Felino extends Animal {

		public void recorrerTerreno() {}
	}
}
