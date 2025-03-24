/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

import java.util.Scanner;

/**
 * @author Docente
 */
public class Entrada {

    private static final Scanner entrada = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextLine();
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Error - Debe introducir un número entero.");
            }
        }
    }

    public static double leerReal(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return Double.parseDouble(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Error - Debe introducir un número real.");
            }
        }
    }

    public static char leerCaracter(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                String str = entrada.nextLine();

                if (str.length() != 1) {
                    throw new IllegalArgumentException();
                }

                return str.charAt(0);
            } catch (IllegalArgumentException e) {
                System.err.println("Error - Debe introducir al menos un carácter.");
            }
        }
    }
}
