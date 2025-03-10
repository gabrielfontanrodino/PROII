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
                System.out.println(mensaje);
                str = entrada.nextLine();
                num = Integer.parseInt(str);
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número entero.");
                error = true;
            }
        } while(error);

        return num;
    }

    public static double leerReal(String mensaje) {
        System.out.println(mensaje);
        return Double.parseDouble(entrada.nextLine());
    }

    public static char leerCaracter(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextLine().charAt(0);
    }

}
