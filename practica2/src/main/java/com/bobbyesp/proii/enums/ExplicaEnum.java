/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.enums;

/**
 * @author Docente
 */
public class ExplicaEnum {

    public static void main(String[] args) {
        DiasSemana d;

        d = DiasSemana.JUEVES;

        if (d == DiasSemana.JUEVES) System.out.println("Es Jueves");
        System.out.println("El ordinal del jueves es: " + d.ordinal());

        System.out.println("Hello World!");
        for (int i = 0; i < DiasSemana.values().length; i++) {
            System.out.println(DiasSemana.values()[i].getPosicion() + ".- " + DiasSemana.values()[i]);
            if (DiasSemana.values()[i].esLaborable()) System.out.println(" \tEs laborable");
            System.out.println("Tu energía hoy es: " + DiasSemana.values()[i].energiaTotal(25));
        }

    }
}
