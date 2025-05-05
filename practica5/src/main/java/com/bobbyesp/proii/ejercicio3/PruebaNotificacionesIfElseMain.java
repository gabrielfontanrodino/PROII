package com.bobbyesp.proii.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PruebaNotificacionesIfElseMain {

    public static void main(String[] args) {

        List<Mensaje> mensajes = new ArrayList<>();

        mensajes.add(new Email("Este es el contenido del email."));

        mensajes.add(new SMS("Este es el contenido del SMS."));

        mensajes.add(new App("Este es el contenido de la notificación de la app."));

        for (Mensaje mensaje : mensajes) {
            mensaje.send();
        }
    }
}