package com.bobbyesp.proii.ejercicio3;

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
