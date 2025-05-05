/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio3;

/**
 * @author Docente
 */
public class Libro extends Publicacion {
    private final String editorial;
    private final String lugar;

    public Libro(String editorial, String lugar, String nombre, int anho, int numCitas, Autor primerAutor) {
        super(nombre, anho, numCitas, primerAutor);

        this.editorial = editorial;
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro");
        sb.append(super.toString());
        sb.append("\n\teditorial=").append(editorial);
        sb.append("\n\tlugar=").append(lugar);
        return sb.toString();
    }


}
