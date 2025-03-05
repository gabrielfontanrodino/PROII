/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio3;

/**
 *
 * @author Docente
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public char calcularLetraDni(){
        String letra="TRWAGMYFPDXBNJZSQVHLCKE";
        return letra.charAt(dni%23);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(dni)
                .append(" - ")
                .append(apellido)
                .append(", ")
                .append(nombre);
        
        return sb.toString();
    }
    

    
    
}
