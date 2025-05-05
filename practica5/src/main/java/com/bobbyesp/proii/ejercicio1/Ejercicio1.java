/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            Autor autor = new Autor("orcid", "nombre", "apellidos", "institucion");
            RegistroPublicacionesAutor registro = new RegistroPublicacionesAutor(autor);
            Articulo art = new Articulo("El Jueves", 1, 10, 20, "situacion actual ", 2025, 3);
            Libro libro = new Libro("Rama", "Ourense", "Programacion II", 2025, 3);
            Comunicacion com = new Comunicacion("Congreso programcion", "Ourense", "Spain", "Introduccion a la Herencia", 2025, 3);

            //registro.addPublicacion(com);
            registro.addPublicacion(art);
            registro.addPublicacion(libro);
            registro.addPublicacion(new Articulo("El Jueves", 1, 10, 20, "situacion actual ", 2025, 3));

            //System.out.println(registro.getArticulos());
            System.out.println(registro.getPublicacionesPorClase(com.getClass()));

            //System.out.println(registro);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
