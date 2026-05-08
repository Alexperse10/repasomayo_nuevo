package org.example;

public class Paypal extends Metodopago{
    private String cuenta;
    private double saldo;

    public Paypal(String cuenta){
        this.saldo = 23;
        this.cuenta= cuenta;
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+" € con paypal");
    }

    public boolean validarPaypal() {
        if (!cuenta.matches("[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            System.out.println("Los datos de tu cuenta paypal no son correctos");
            return false;
        }
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
