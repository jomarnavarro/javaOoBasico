package com.testAutomationCoach.bVariables;

public class IntArray {
    public static void main(String[] args) {
        int[] calificaciones;
        calificaciones = new int[5];
        calificaciones[0] = 89;
        calificaciones[1] = 92;
        calificaciones[2] = 83;
        calificaciones[3] = 100;
        calificaciones[4] = 100;

        int len = calificaciones.length;
        System.out.println("Hay " + len + " calificaciones.");

        //sacar promedio?
        int promedio = sacarPromedio(calificaciones);

    }

    private static int sacarPromedio(int[] calificaciones) {
        //implement
        return -1;
    }
}
