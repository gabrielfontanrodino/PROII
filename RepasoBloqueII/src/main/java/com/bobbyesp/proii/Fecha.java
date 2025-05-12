/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii;

/**
 *
 * @author Docente
 */
public class Fecha {
    final private int dia;
    final private int mes;
    final private int anho;
    //las invariantes os las dejo planteadas para vosotros

    public Fecha(int dia, int mes, int anho) {
        validarFecha(dia, mes, anho);
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    private void validarFecha(int dia, int mes, int anho) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia incorrecto");
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes incorrecto");
        }
        if (anho < 0) {
            throw new IllegalArgumentException("Año incorrecto");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: ");
        sb.append(dia);
        sb.append("/").append(mes);
        sb.append("/").append(anho);
        return sb.toString();
    }
    
    
}
