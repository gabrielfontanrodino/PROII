package com.bobbyesp.proii.ejercicio3;

public abstract class Mensaje implements Sendable {
    private final String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

}