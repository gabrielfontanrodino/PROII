package com.bobbyesp.proii.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.Scanner;

public class AplicacionFichero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        OperadorFichero operadorFichero = null;

        try {
            // CUARTA TAREA: Si el fichero no existe, se solicita la ruta en bucle.
            while (true) {
                try {
                    System.out.println("Indica la ruta al fichero a operar: ");
                    String rutaFichero = entrada.nextLine();
                    File fichero = new File(rutaFichero);
                    operadorFichero = new OperadorFichero(fichero);
                    break; // Se sale del bucle si el fichero existe
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Por favor, introduce una ruta válida.");
                }
            }

            // Lectura inicial del fichero
            System.out.println("Contenidos del fichero:");
            try {
                System.out.println(operadorFichero.readFile());
            } catch (AccessDeniedException ade) {
                System.out.println("Error: Acceso denegado al leer el fichero.");
                return;
            } catch (IOException ioe) {
                System.out.println("Error de lectura del fichero: " + ioe.getMessage());
                return;
            }

            // Bucle para añadir líneas al fichero
            String linea;
            do {
                System.out.println("Añadamos una línea al fichero (línea vacía si quieres terminar): ");
                linea = entrada.nextLine().trim();
                if (!linea.isEmpty()) {
                    try {
                        operadorFichero.addText(linea + "\n");
                        System.out.println("Línea añadida");
                    } catch (AccessDeniedException ade) {
                        System.out.println("Error: Acceso denegado al escribir en el fichero.");
                        return;
                    } catch (IOException ioe) {
                        System.out.println("Error al escribir en el fichero: " + ioe.getMessage());
                        return;
                    }
                }
            } while (!linea.isEmpty());

            // Lectura final del fichero
            System.out.println("Contenidos actualizados del fichero:");
            try {
                System.out.println(operadorFichero.readFile());
            } catch (AccessDeniedException ade) {
                System.out.println("Error: Acceso denegado al leer el fichero.");
                return;
            } catch (IOException ioe) {
                System.out.println("Error de lectura del fichero: " + ioe.getMessage());
                return;
            }

        } finally {
            // QUINTA TAREA: Siempre se cierra el Scanner y se muestra el mensaje antes de salir.
            entrada.close();
            System.out.println("Hasta la próxima.");
        }
    }
}
