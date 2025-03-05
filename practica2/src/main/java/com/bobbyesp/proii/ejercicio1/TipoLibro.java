/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 *
 * @author Docente
 */
public enum TipoLibro {
    NOVELA,
    HISTORIA,
    MATEMATICAS,
    TECNOLOGIA;
    @Override
    public String toString() {
        return  Character.toString(name().charAt(0)) + name().substring(1).toLowerCase()    ;
    }
}
