package com.bobbyesp.proii;

/**
 * @author Docente
 */
public class Nadador extends Deportista {
    private double frecuenciaBrazada;

    public Nadador(double frecuenciaBrazada, String dni, String nombre, String categoria, int edad) {
        super(dni, nombre, categoria, edad);
        this.frecuenciaBrazada = frecuenciaBrazada;
    }

    @Override
    public int getRepeticionesMarca(int pos) {
        Marca marca = this.getMarca(pos);
        return (int) (marca.getTiempo() * frecuenciaBrazada);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nadador:\n");
        sb.append(super.toString());
        sb.append("frecuenciaBrazada=").append(frecuenciaBrazada);
        sb.append('}');
        return sb.toString();
    }


}
