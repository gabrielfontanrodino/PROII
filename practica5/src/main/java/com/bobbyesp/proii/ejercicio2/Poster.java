package com.bobbyesp.proii.ejercicio2;

public class Poster extends Comunicacion {
    private final String nombreSesion;
    private final String nombreSala;
    private final Hora hora;

    public Poster(String nombreCongreso, String ciudad, String pais, String nombrePublicacion, int anho, int numCitas,
                  String nombreSesion, String nombreSala, int hora, int minutos) {
        super(nombreCongreso, ciudad, pais, nombrePublicacion, anho, numCitas);

        this.nombreSesion = nombreSesion;
        this.nombreSala = nombreSala;
        this.hora = new Hora(hora, minutos);
    }

    @Override
    public double getPeso() { return 0.2; }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Poster");
        sb.append("\n\tNombre de la sesión: '").append(nombreSesion).append('\'');
        sb.append("\n\tNombre de la sala: '").append(nombreSala).append('\'');
        sb.append("\n\tHora: ").append(hora);
        sb.append("\n\tCitas: ").append(getCitas());
        return sb.toString();
    }
}
