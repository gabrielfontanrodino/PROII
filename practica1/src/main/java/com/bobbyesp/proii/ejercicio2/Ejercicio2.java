/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class Ejercicio2 {

    public static void main(String[] args) {
    
    String nombre;
    String apellido;
    String usuario;
    String servidor;
    
    Email usuario1;
    Email usuario2;
    
    Scanner entrada = new Scanner(System.in);
        System.out.println("nombre");
        nombre = entrada.nextLine();
        System.out.println("apellido");
        apellido = entrada.nextLine();
        System.out.println("usuario");
        usuario = entrada.nextLine();
        System.out.println("servidor");
        servidor = entrada.nextLine();
        
        usuario1 = new Email(nombre, apellido, usuario, servidor);
        usuario2 = new Email(nombre, apellido);
        
        System.out.println(usuario1);
        System.out.println(usuario2);
    
    }
}



    
