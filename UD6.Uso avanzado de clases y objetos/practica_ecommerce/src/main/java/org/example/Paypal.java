package org.example;

public class Paypal extends Metodopago{
    private String cuenta;
    private double saldo;

    public Paypal(String cuenta, double saldo){
        this.saldo = 23;
        this.cuenta= cuenta;
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+" € con paypal");
    }

    public void validarPaypal() {

    }
}
