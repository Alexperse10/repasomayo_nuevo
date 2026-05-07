package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tienda {
    static Scanner sc = new Scanner(System.in);

    static void realizarPago(Metodopago metodo) {
        System.out.println("introducir el importe a pagar");
        double importe = sc.nextDouble();
        metodo.procesarPago(importe);

    }

    static void iniciarPago() {
        System.out.println("Que metodo de pago quieres usar? [bizum, paypal, tarjeta]");
        String metodopago = sc.nextLine();

        switch (metodopago) {
            case "tarjeta":
                System.out.println("introduce los datos de tu tarjeta");
                String datos_tarjeta = sc.nextLine();
                System.out.println("Selecciona el tipo de tarjeta [visa, maestro, mastercard]");
                String tipo = sc.nextLine();
                TarjetaCredito tarjetaCredito1 = new TarjetaCredito(datos_tarjeta, tipo);
                tarjetaCredito1.validartarjeta();
                break;

            case "bizum":
                System.out.println("introduce el numero de tu numero de telefono vinculado con bizum");
                String numerotelefono = sc.nextLine();

                Random aleatorio = new Random();
                String valor_ = "";
                for (int i = 0; i < 6; i++) {
                    int valor = aleatorio.nextInt(10) + 1;
                    valor_ = valor_ + valor;
                }
                int Pin_int = Integer.parseInt(valor_);
                System.out.println("el numero pin chivato es" + Pin_int);

                System.out.println("Introduce el numero pin");
                int numeropin = sc.nextInt();
                Bizum bizum1 = new Bizum(numerotelefono, numeropin);
                if (Pin_int != numeropin) {
                    System.out.println("Los datos no son correcto");

                } else {
                    bizum1.validarBizum();
                }
                break;


        }
    }
}


