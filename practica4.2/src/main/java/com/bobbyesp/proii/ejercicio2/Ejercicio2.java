/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio2;

/**
 * @author Docente
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            Articulo art = new Articulo("El Jueves", 1, 10, 20, "situacion actual ", 2025, 3);
            Libro libro = new Libro("Rama", "Ourense", "Programacion II", 2025, 3);

            Comunicacion com = new Comunicacion("Congreso programcion", "Ourense", "Spain", "Introduccion a la Herencia", 2025, 3);
            System.out.println(art);
            System.out.println(libro);
            System.out.println(com);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
