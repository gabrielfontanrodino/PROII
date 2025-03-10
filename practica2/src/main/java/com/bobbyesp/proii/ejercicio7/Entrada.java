/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class Entrada {
    
    private static final Scanner entrada = new Scanner(System.in);
    
    public static String leerCadena(String mensaje){
        System.out.println(mensaje); 
        return entrada.nextLine();
    }
    
    public static int leerEntero(String mensaje){
        System.out.println(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }
    
    public static double leerReal(String mensaje){
        System.out.println(mensaje);
        return Double.parseDouble(entrada.nextLine());
    }
    
    public static char leerCaracter(String mensaje){
        System.out.println(mensaje);
        return entrada.nextLine().charAt(0);
    }

}
