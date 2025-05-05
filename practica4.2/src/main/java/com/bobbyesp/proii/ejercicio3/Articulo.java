/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio3;

/**
 * @author Docente
 */
public class Articulo extends Publicacion {
    private final String nombreRevista;
    private final int volumen;
    private final int pagInicial;
    private final int pagFinal;

    public Articulo(String nombreRevista, int volumen, int pagInicial, int pagFinal, String nombre, int anho, int numCitas, Autor primerAutor)
            throws IllegalArgumentException {
        super(nombre, anho, numCitas, primerAutor);

        if (volumen < 0)
            throw new IllegalArgumentException("Los volumenes no pueden ser negativos");
        if (pagInicial < 1 || pagInicial > pagFinal)
            throw new IllegalArgumentException("Pagina inicial o final incorrecta");

        this.nombreRevista = nombreRevista;
        this.volumen = volumen;
        this.pagInicial = pagInicial;
        this.pagFinal = pagFinal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Articulo");
        sb.append(super.toString());
        sb.append("\n\tnombreRevista=").append(nombreRevista);
        sb.append("\n\tvolumen=").append(volumen);
        sb.append("\n\tpagInicial=").append(pagInicial);
        sb.append("\n\tpagFinal=").append(pagFinal);

        return sb.toString();
    }


}
