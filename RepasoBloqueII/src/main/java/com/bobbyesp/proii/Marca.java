/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii;

/**
 * @author Docente
 */
public class Marca {
    //invariantes sólo creo la de tiempo
    //fecha composicion fuerte
    private final double tiempo;
    private final int distancia;
    private final String referencia;
    private final Fecha fecha;

    public Marca(double tiempo, int distancia, String referencia, int dia, int mes, int anho) {
        if (tiempo <= 0) throw new IllegalArgumentException("Tiempo debe ser mayor que cero");
        this.tiempo = tiempo;
        this.distancia = distancia;
        this.referencia = referencia;
        this.fecha = new Fecha(dia, mes, anho);
    }

    public double getTiempo() {
        return tiempo;
    }

    public int getDistancia() {
        return distancia;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ");
        sb.append("tiempo=").append(tiempo);
        sb.append(", distancia=").append(distancia);
        sb.append(", referencia=").append(referencia);
        sb.append(", fecha=").append(fecha);
        sb.append("\n");
        return sb.toString();
    }


}
