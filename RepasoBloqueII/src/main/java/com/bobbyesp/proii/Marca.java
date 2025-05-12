package com.bobbyesp.proii;

/**
 * @author Docente
 */
public class Marca {
    private final double tiempo;
    private final int distancia;
    private final String referencia;
    private final Fecha fecha;

    public Marca(double tiempo, int distancia, String referencia, int dia, int mes, int anho) {
        if (tiempo <= 0) throw new IllegalArgumentException("Tiempo debe ser mayor que cero");
        this.tiempo = tiempo;
        this.distancia = distancia;
        this.referencia = referencia;
        this.fecha = new Fecha(dia, mes, anho);
    }

    public double getTiempo() {
        return tiempo;
    }

    public int getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        String sb = "Marca: " +
                "tiempo=" + tiempo +
                ", distancia=" + distancia +
                ", referencia=" + referencia +
                ", fecha=" + fecha +
                "\n";
        return sb;
    }

}
