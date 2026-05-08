package org.example;

import javax.swing.*;
import java.util.Random;

public class Bizum extends Metodopago{

private String telefono;
private int pin;

public Bizum(String telefono, int pin) {
    this.telefono = telefono;
    this.pin = pin;
}



public void validarBizum() { // comprobar el formato del telefono y el pin introducido


    if (!telefono.matches("\\d{9}") && pin != 6) {
        System.out.println("Los datos no son validos");
    }

}
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago "+importe+" con bizum");
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}
