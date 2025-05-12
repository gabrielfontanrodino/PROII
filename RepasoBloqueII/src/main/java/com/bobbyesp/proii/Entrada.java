package com.bobbyesp.proii;

import java.util.Scanner;

public class Entrada {

    private Scanner teclado;
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";


    /**
     * constructor que inicializa el objeto de tipo Escanner para leer por teclado
     */
    public Entrada() {
        this.teclado = new Scanner(System.in);
    }
 

    /**
     * Lee una cadena de texto desde teclado comprobando que no sea vacía
     *
     * @param mensaje texto que especifica lo que el usuario debe introducir
     * @return String cadena leida del teclado
     */
    public String leeCadena(String mensaje) {
        String cadena = "";
        boolean valida = false;
        
        while (!valida) {
            System.out.print(mensaje);
            cadena = teclado.nextLine().trim();
            
            if (!cadena.isEmpty()) {
                valida = true;
            } else {
                System.err.println("ERROR: la cadena no puede estar vacía");
            }
        }
        return cadena;
    }

    /**
     * Lee un número entero desde teclado y verifica que sea válido
     *
     * @param mensaje texto que especifica lo que el usuario debe introducir
     * @return el número, como entero
     */
    public int leeEntero(String mensaje) {
        boolean esValido = false;
        int toret = 0;

        do {
            try {
                toret = Integer.parseInt(leeCadena(mensaje));
                esValido = true;
            } catch (NumberFormatException exc) {
                System.err.println("ERROR: no se ha introducido un número");
            }
        } while (!esValido);

        return toret;
    }
    
    /**
     * Lee un DNI desde teclado y verifica que sea válido
     * Un DNI válido tiene 8 dígitos seguidos de una letra válid
     * @param mensaje texto para solicitar el DNI
     * @return El DNI válido leído
     */
    public String leeDNI(String mensaje) {
        String dni = "";
        boolean valido = false;

        while (!valido) {
            dni = leeCadena(mensaje).toUpperCase();
            if (dni.matches("\\d{8}[A-Z]")) {
                int numeroDNI = Integer.parseInt(dni.substring(0, 8));
                char letraDNI = dni.charAt(8);
                if (letraDNI == LETRAS_DNI.charAt(numeroDNI % 23)) {
                    valido = true;
                } else {
                    System.err.println("ERROR: la letra del DNI no es correcta");
                }
            } else {
                System.err.println("ERROR: el formato del DNI no es correcto");
            }
        }
        return dni;

        /**
         * Valida si un DNI tiene el formato correcto y la letra correcta.
         *
         * @param dni El DNI a validar
         * @return true si el DNI es válido, false en caso contrario
         */


    }
 
}
