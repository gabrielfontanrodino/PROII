package com.bobbyesp.proii.ejercicio4;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("Saldo debe ser mayor o igual que 0");
        }
    }

    public double ingresar(double dinero) {
        if (dinero < 0) {
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa.");
        }
        saldo = saldo + dinero;
        return saldo;
    }

    public double retirar(double dinero) {
        if (dinero < 0) {
            throw new IllegalArgumentException("No se puede retirar una cantidad negativa.");
        }
        if ((saldo - dinero) < 0) {
            throw new IllegalArgumentException("Cantidad no disponible, el máximo a retirar es: " + saldo);
        }
        saldo = saldo - dinero;
        return saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("titular=").append(titular);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
