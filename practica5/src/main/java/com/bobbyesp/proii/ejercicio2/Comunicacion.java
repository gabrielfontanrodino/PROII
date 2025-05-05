/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

/**
 * @author Docente
 */
public class Comunicacion extends Publicacion {
    private final String nombreCongreso;
    private final String ciudad;
    private final String pais;

    public Comunicacion(String nombreCongreso, String ciudad, String pais, String nombre, int anho, int numCitas) {
        super(nombre, anho, numCitas);

        this.nombreCongreso = nombreCongreso;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    @Override
    public double getPeso() {
        return 0.6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comunicacion");
        sb.append(super.toString());
        sb.append("\n\tNombre del congreso: ").append(nombreCongreso);
        sb.append("\n\tCiudad: ").append(ciudad);
        sb.append("\n\tPaís: ").append(pais);
        return sb.toString();
    }


}
