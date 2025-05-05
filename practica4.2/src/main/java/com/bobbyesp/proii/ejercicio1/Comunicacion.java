/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Comunicacion extends Publicacion {
    private final String nombreCongreso;
    private final String ciudad;
    private final String pais;

    public Comunicacion(String nombreCongreso, String ciudad, String pais, String nombre, int anho) {
        super(nombre, anho);

        this.nombreCongreso = nombreCongreso;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comunicacion");
        sb.append(super.toString());
        sb.append("\n\tnombreCongreso=").append(nombreCongreso);
        sb.append("\n\tciudad=").append(ciudad);
        sb.append("\n\tpais=").append(pais);
        return sb.toString();
    }


}
