/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

/**
 * @author Docente
 */
public class Reunion {

    private String asunto;
    private String lugar;
    private final Fecha fecha;
    private final Hora hora;

    public Reunion(String asunto, String lugar, Fecha fecha, Hora hora) {
        this.asunto = asunto;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" == Reunion == ");
        sb.append("\nAsunto: ").append(asunto);
        sb.append("\nLugar: ").append(lugar);
        sb.append("\nFecha: ").append(fecha);
        sb.append("\nHora: ").append(hora);
        sb.append("\n===============");
        return sb.toString();
    }


}
