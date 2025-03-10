/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

/**
 * @author Docente
 */
public class Email {
    private static final String SERVIDOR = "esei.uvigo.es";
    private String nombre;
    private String apellido;
    private String usuario;
    private String servidor;

    public Email(String nombre, String apellido, String usuario, String servidor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.servidor = servidor;
    }

    public Email(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = apellido.split(" ")[0] + nombre.charAt(0);
        this.servidor = SERVIDOR;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getServidor() {
        return servidor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getApellido());
        sb.append(", ").append(this.getNombre());
        sb.append(": ").append(usuario);
        sb.append("@").append(servidor);
        return sb.toString();
    }


}
