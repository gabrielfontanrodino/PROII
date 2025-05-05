/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Publicacion {
    private final String nombre;
    private final int anho;

    public Publicacion(String nombre, int anho) {
        this.nombre = nombre;
        this.anho = anho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n\tnombre=").append(nombre);
        sb.append("\n\tanho=").append(anho);

        return sb.toString();
    }

}
