package com.bobbyesp.proii;

/**
 * @author Docente
 */
public class Corredor extends Deportista {
    private final double longitudZancada;

    public Corredor(double longitudZancada, String dni, String nombre, String categoria, int edad) {
        super(dni, nombre, categoria, edad);
        this.longitudZancada = longitudZancada;
    }

    @Override
    public String toString() {
        String sb = "Corredor:\n" +
                super.toString() +
                "longitudZancada=" + longitudZancada +
                '}';
        return sb;
    }

    @Override
    public int getRepeticionesMarca(int pos) {
        Marca marca = this.getMarca(pos);
        return (int) (marca.getDistancia() / longitudZancada);

    }

}
