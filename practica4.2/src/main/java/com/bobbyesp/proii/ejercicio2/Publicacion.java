/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

/**
 * @author Docente
 */
public class Publicacion {
    private final String nombre;
    private final int anho;
    private final int numCitas;

    public Publicacion(String nombre, int anho, int numCitas) {
        if (numCitas < 0) throw new IllegalArgumentException("El numero de citas no puede ser negativo");
        this.nombre = nombre;
        this.anho = anho;
        this.numCitas = numCitas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n\tnombre=").append(nombre);
        sb.append("\n\tanho=").append(anho);
        sb.append("\n\tNumero de citas: ").append(numCitas);

        return sb.toString();
    }

}
