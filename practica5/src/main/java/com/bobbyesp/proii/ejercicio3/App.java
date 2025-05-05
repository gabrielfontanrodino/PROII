package com.bobbyesp.proii.ejercicio3;

public class App extends Mensaje {
    public App(String texto) {
        super(texto);
    }

    @Override
    public void send() {
        System.out.println("[App] " + this.getTexto());
    }
}
