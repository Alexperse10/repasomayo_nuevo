package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria () {
        this.saldo = 500;
    }

    public double ingregardinero() {
        return 0;
    }

    public double retirardinero() {
    return 0;
    }

    public void mostrarsaldo () {
        System.out.println("el saldo disponible es: "+getSaldo());
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
