/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio4;

import java.util.Objects;

/**
 *
 * @author Docente
 */
public class Asistente {
    private String nombre;
    private String correo;

    public Asistente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.correo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asistente other = (Asistente) obj;
        if (!(this.nombre.equalsIgnoreCase( other.nombre))) {
            return false;
        }
        return Objects.equals(this.correo, other.correo);
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistente{");
        sb.append("nombre=").append(nombre);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
