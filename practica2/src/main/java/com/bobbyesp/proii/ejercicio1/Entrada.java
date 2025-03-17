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
        int num = 0;
        String str;
        boolean error;

        do {
            try {
                System.out.print(mensaje);
                str = entrada.nextLine();
                num = Integer.parseInt(str);
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error - Debe introducir un número entero.");
                error = true;
            }
        } while (error);

        return num;
    }

    public static double leerReal(String mensaje) {
        double num = 0.0;
        String str;
        boolean error;

        do {
            try {
                System.out.print(mensaje);
                str = entrada.nextLine();
                num = Double.parseDouble(str);
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error - Debe introducir un número real.");
                error = true;
            }
        } while (error);

        return num;
    }

    public static char leerCaracter(String mensaje) {
        String str = "";
        boolean error;

        do {
            try {
                System.out.print(mensaje);
                str = entrada.nextLine();
                if (str.length() != 1) {
                    throw new IllegalArgumentException("Error - Debe introducir un solo carácter.");
                }
                error = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                error = true;
            }
        } while (error);

        return str.charAt(0);
    }

}
