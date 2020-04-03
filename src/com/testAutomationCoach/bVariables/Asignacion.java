package com.testAutomationCoach.bVariables;

public class Asignacion {
    public static void main(String[] args) {
        //primitivas
        int edad;
        double salario;
        boolean esAdulto;
        char inicial;

        //inicializacion literal
        edad = 43;
        salario = 120000.00;

        //inicializacion por otra variable, expresion o metodo
        int nuevaEdad = 44;
        edad = nuevaEdad;

        double aumentoSalario = salario * 1.15;
        esAdulto = esMayorEdad(edad);
        inicial = "Omar".charAt(0);

    }

    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }
}
