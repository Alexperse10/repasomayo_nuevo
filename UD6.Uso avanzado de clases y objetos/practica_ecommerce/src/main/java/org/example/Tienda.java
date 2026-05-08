package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tienda {
    static Scanner sc = new Scanner(System.in);
    static double importe;
    static void realizarPago(Metodopago metodo) {

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
                if (tarjetaCredito1.validartarjeta()) {
                    System.out.println("introducir el importe a pagar");
                    importe = sc.nextDouble();
                    Tienda.realizarPago(tarjetaCredito1);

                }

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
                    System.out.println("introducir el importe a pagar");
                    importe = sc.nextDouble();
                    Tienda.realizarPago(bizum1);
                }
                break;

            case "paypal":
                System.out.println("Introduce tu correo electronico vinculado con paypal");
                String paypal = sc.nextLine();
                Paypal paypal1 = new Paypal(paypal);

                System.out.println("introduce el importe a pagar");
                 importe = sc.nextDouble();
                if (paypal1.getSaldo()<importe){
                    System.out.println("no tienes suficiente dinero");
                } else if (paypal1.validarPaypal()) {
                    realizarPago(paypal1);
                }
                break;

                }


//                if (paypal1.getSaldo()<importe) {
//                    System.out.println("No tienes suficiente dinero en la cuenta para pagar");
//
//                }else {
//                    paypal1.validarPaypal();
//
//                }



        }
    }



