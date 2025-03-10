/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 *
 * @author gfrodinho_esei.uvigo
 */
public enum TipoLibro {
    NOVELA, HISTORIA, MATEMATICAS, TECNOLOGIA;

    public static TipoLibro leerTipoLibro() {
        int opcion;

        System.out.println("Introduzca el tipo de libro: ");

        do {
            for (int i = 0; i < TipoLibro.values().length; i++) {
                System.out.println((TipoLibro.values()[i].ordinal() + 1) + ".- " + TipoLibro.values()[i].toString());
            }
            opcion = Entrada.leerEntero("Seleccione una opción: ");

        } while (opcion < 1 || opcion > TipoLibro.values().length);

        return TipoLibro.values()[(opcion - 1)];
    }
}
