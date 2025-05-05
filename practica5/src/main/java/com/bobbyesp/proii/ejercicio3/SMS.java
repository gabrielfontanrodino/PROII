package com.bobbyesp.proii.ejercicio3;

public class SMS extends Mensaje {

    public SMS(String texto) {
        super(texto);
    }

    @Override
    public void send() {
        System.out.println("[SMS] " + this.getTexto());
    }
}
