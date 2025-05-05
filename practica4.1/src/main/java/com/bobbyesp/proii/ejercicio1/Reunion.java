package com.bobbyesp.proii.ejercicio1;

public class Reunion {

    private String asunto;
    private String lugar;
    private final Fecha fecha;
    private final Hora hora;

    public Reunion(String asunto, String lugar, int anho, int mes, int dia, int hora, int minutos) {
        this.asunto = asunto;
        this.lugar = lugar;
        this.fecha = new Fecha(dia, mes, anho);
        this.hora = new Hora(hora, minutos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" == Reunion == ");
        sb.append("\nAsunto: ").append(asunto);
        sb.append("\nLugar: ").append(lugar);
        sb.append("\nFecha: ").append(fecha);
        sb.append("\nHora: ").append(hora);
        sb.append("\n===============");
        return sb.toString();
    }


}
