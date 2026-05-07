package org.example;

public class TarjetaCredito extends Metodopago{


    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta; //16 caracteres
        this.tipo = tipo; // solo permite visa, mastercard, maestro

    }

    public void validartarjeta () {// compruebe que el numero de tarjeta introducido tenga longitud esperada
        System.out.println("Validando tarjeta....");
        if (!nro_tarjeta.matches("[a-zA-Z0-9]{16}") && (!tipo.equalsIgnoreCase("visa") || !tipo.equalsIgnoreCase("mastercard") || !tipo.equalsIgnoreCase("maestro"))){
            System.out.println("Los datos de tu tarjeta no son correcto");
        }else {
            Tienda.realizarPago(this);
        }
    }



    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+" con tarjeta de credito"+tipo);
    }
}
