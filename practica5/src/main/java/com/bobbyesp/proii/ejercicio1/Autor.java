/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Autor {
    private final String orcid;
    private final String nombre;
    private final String apellidos;
    private final String institucion;

    public Autor(String orcid, String nombre, String apellidos, String institucion) {
        this.orcid = orcid;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.institucion = institucion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor");
        sb.append("\n\t orcid=").append(orcid);
        sb.append("\n\t nombre=").append(nombre);
        sb.append("\n\t apellidos=").append(apellidos);
        sb.append("\n\t institucion=").append(institucion);

        return sb.toString();
    }


}
