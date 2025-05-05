package com.bobbyesp.proii.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String rutaFichero;
        File fichero = null;
        OperadorFichero operadorFichero = null;
        try {
            while (operadorFichero == null) {
                try {
                    System.out.println("Indica la ruta al fichero a operar: ");

                    rutaFichero = entrada.nextLine();

                    fichero = new File(rutaFichero);
                    operadorFichero = new OperadorFichero(fichero);
                } catch (IllegalArgumentException e) {
                    System.out.println("Fichero inexsistente");
                }
            }

            System.out.println("Contenidos del fichero: " + fichero);

            System.out.println(operadorFichero.leerFichero());

            String linea;
            do {
                System.out.println("Añadamos una línea al fichero (linea vacía si quieres terminar): ");
                linea = entrada.nextLine().trim();
                if (!linea.isEmpty()) {
                    operadorFichero.appendTexto(linea + "\n");
                    System.out.println("Línea añadida");
                }

            } while (!linea.isEmpty());

            System.out.println("Contenidos del fichero: " + fichero);
            System.out.println(operadorFichero.leerFichero());

            System.out.println("Que tengas un buen día");
        } catch (AccessDeniedException ex) {
            System.out.println("No tienes permiso para acceder a este fichero" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de lectura de fichero");
        } catch (Exception ex) {
            System.out.println("ERROR");
        } finally {
            entrada.close();
            System.out.println("Que tengas un buen día");
        }
    }
}
