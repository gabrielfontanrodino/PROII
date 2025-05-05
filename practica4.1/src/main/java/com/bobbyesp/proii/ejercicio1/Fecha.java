
package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dia);
        sb.append("/").append(mes);
        sb.append("/").append(ano);
        return sb.toString();
    }


}
