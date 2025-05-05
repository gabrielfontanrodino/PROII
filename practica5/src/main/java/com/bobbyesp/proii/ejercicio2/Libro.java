/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

/**
 * @author Docente
 */
public class Libro extends Publicacion {
    private final String editorial;
    private final String lugar;

    public Libro(String editorial, String lugar, String nombre, int anho, int numCitas) {
        super(nombre, anho, numCitas);

        this.editorial = editorial;
        this.lugar = lugar;
    }

    @Override
    public double getPeso() {
        return 0.8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro");
        sb.append(super.toString());
        sb.append("\n\tEditorial: ").append(editorial);
        sb.append("\n\tLugar: ").append(lugar);
        return sb.toString();
    }


}
