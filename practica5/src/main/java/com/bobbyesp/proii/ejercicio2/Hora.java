package com.bobbyesp.proii.ejercicio2;

public record Hora(int hora, int minutos) {
    public Hora {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23.");
        }
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59.");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}
