
package com.bobbyesp.proii.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear fecha y hora para la reunión
        Fecha fecha = new Fecha(15, 10, 2023);
        Hora hora = new Hora(10, 30);

        // Crear asistentes
        Asistente secretario = new Asistente("Juan Pérez", "juan.perez@example.com");
        Asistente asistente1 = new Asistente("María López", "maria.lopez@example.com");
        Asistente asistente2 = new Asistente("Carlos García", "carlos.garcia@example.com");

        // Crear reunión con el secretario
        Reunion reunion = new Reunion("Reunión de Proyecto", "Sala A", fecha, hora, secretario);

        // Agregar asistentes
        reunion.agregarAsistente(asistente1);
        reunion.agregarAsistente(asistente2);

        // Mostrar información de la reunión
        System.out.println(reunion);

        // Mostrar número de asistentes
        System.out.println("Número de asistentes: " + reunion.getNumAsistentes());

        // Obtener y mostrar un asistente por posición
        System.out.println("Asistente en posición 1: " + reunion.getAsistentePosicion(1));

        // Cambiar el secretario
        reunion.cambiarSecretario(asistente1);
        System.out.println("Nuevo secretario: " + asistente1);

        // Eliminar un asistente
        try {
            reunion.eliminarAsistente(2);
        } catch (IllegalArgumentException e) {
            System.err.println("No se ha podido elimnar al asistente. Causa: " + e.getLocalizedMessage());
        }

        System.out.println("Asistente eliminado. Número de asistentes: " + reunion.getNumAsistentes());

        // Verificar si la reunión está llena
        System.out.println("¿La reunión está llena? " + reunion.isFull());
    }
}