/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Docente
 */
public class RegistroPublicacionesAutor {
    private Autor autor;
    private List<Publicacion> publicaciones;

    public RegistroPublicacionesAutor(Autor autor) {
        this.autor = autor;
        this.publicaciones = new ArrayList<>();
    }

    public void addPublicacion(Publicacion p) {
        if (p == null)
            throw new IllegalArgumentException("La publicacion no puede ser nula");
        if (publicaciones.contains(p))
            throw new IllegalArgumentException("La publicacion ya existe");
        publicaciones.add(p);
    }

    public String getPublicaciones() {
        StringBuilder sb = new StringBuilder();
        for (Publicacion publicacion : publicaciones) {
            sb.append(publicacion).append("\n");
        }
        if (sb.isEmpty())
            sb.append("No hay publicaciones que mostrar");
        return sb.toString();
    }

    public String getArticulos() {
        StringBuilder sb = new StringBuilder();

        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Articulo) {
                sb.append(publicacion).append("\n");
            }
        }

        if (sb.isEmpty())
            sb.append("No hay articulos para mostrar");

        return sb.toString();
    }

    public String getPublicacionesPorClase(Class clase) {
        StringBuilder sb = new StringBuilder();

        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getClass().equals(clase)) {
                sb.append(publicacion).append("\n");
            }
        }

        if (sb.isEmpty())
            sb.append("No hay objetos de la clase: ").append(clase.getSimpleName());

        return sb.toString();
    }

    //(NúmeroCitasArticulo * 1) + (NúmeroCitasLibro * 0.8) + (NúmeroCitasComunicacion * 0.6)
    public double calcularIndiceC() {
        double indiceC = 0;

        for (Publicacion publicacion : publicaciones) {
            indiceC += publicacion.getIndiceC();
        }

        return indiceC;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(autor).append("\n");
        sb.append("Publicaciones \n");
        sb.append("\t").append(getPublicaciones());
        sb.append("\nÍndice ").append(calcularIndiceC());
        return sb.toString();
    }

}
