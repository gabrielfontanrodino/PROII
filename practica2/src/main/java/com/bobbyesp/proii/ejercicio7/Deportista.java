/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio7;

/**
 *
 * @author Docente
 */
public class Deportista {
    private int dni;
    private String nombre;
    private Categoria cat;

    public Deportista(int dni, String nombre, Categoria cat) {
        this.dni = dni;
        this.nombre = nombre;
        this.cat = cat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportista: ");
        sb.append("\nDNI:  ").append(dni);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nCategoria: ").append(cat);
        return sb.toString();
    }

    
}
