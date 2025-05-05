package com.bobbyesp.proii.ejercicio3;

public class Email extends Mensaje {
    public Email(String texto) {
        super(texto);
    }

    @Override
    public void send() {
        System.out.println("[Email] " + this.getTexto());
    }
}
