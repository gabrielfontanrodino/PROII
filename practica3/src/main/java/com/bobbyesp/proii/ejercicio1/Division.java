package com.bobbyesp.proii.ejercicio1;

import java.util.Scanner;

public class Division {
    public static int divide(int a, int b) {
        // Opción: lanzar la excepción manualmente
        // if(b == 0){
        //     throw new ArithmeticException("El divisor no puede ser cero.");
        // }
        // return a / b;

        // Opción: dejar que la división por 0 lance la excepción por sí sola.
        return a / b;
    }

    public static void main(String[] args) {
        int num1, num2;

        // Validación de la entrada para el dividendo
        num1 = Entrada.leerEntero("Introduzca dividendo: ");
        num2 = Entrada.leerEntero("Introduzca divisor: ");

        // Intentar realizar la división y capturar la excepción de división por cero
        try {
            System.out.println("\nEl resultado es: " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no está permitida.");
        }
    }
}