package com.bobbyesp.proii.ejercicio4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Docente
 */
public class Hora {
    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hora);
        sb.append(":").append(minutos);
        return sb.toString();
    }
    
    
}
