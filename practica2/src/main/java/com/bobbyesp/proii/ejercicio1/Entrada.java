/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class Entrada {
    
    private Scanner entrada = new Scanner(System.in);
    
    public String leerCadenas(String mensaje){
        System.out.println(mensaje); 
        return entrada.nextLine();
    }
    
    public int leerEntero(String mensaje){
        System.out.println(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }
    
    public double leerReal(String mensaje){
        System.out.println(mensaje);
        return Double.parseDouble(entrada.nextLine());
    }
    
    public char leerCaracter(String mensaje){
        System.out.println(mensaje);
        return entrada.nextLine().charAt(0);
    }
    
    
}
