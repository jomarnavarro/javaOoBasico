package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;
	
	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	//comportamiento
	public void acelerar() {
		Input.print("run run\n");
		this.velocidadActual += 5.0;
	}
	
	public void frenar() {
		Input.print("Screeeeech!\n");
		this.velocidadActual = 0;
	}
	
	public void retroceder() {
		Input.print("piii piii piii piii\n");
		this.velocidadActual -= -5;
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}
}
