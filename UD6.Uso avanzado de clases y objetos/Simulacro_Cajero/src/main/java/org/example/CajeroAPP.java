package org.example;

import java.util.Scanner;

public class CajeroAPP {
    public static void main(String[] args) throws DepositoMaximoException, LimiteDiarioException, SaldoInsuficienteException {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("=== Cajero automatico ===");
            System.out.println("[1] Consultar saldo");
            System.out.println("[2] Ingresar dinero");
            System.out.println("[3] Retirar dinero");
            System.out.println("[x] salir");

            System.out.println("selecciona una opcion");
            char opcion = sc.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    cuenta1.mostrarsaldo();
                    break;

                case '2':
                    System.out.println("introduce el importe a ingresar");
                    double ingresar = sc.nextDouble();
                    if (ingresar>0) {
                        cuenta1.ingregardinero(ingresar);
                    }else {
                        System.out.println("Importe debe ser mayor que cero");

                    }
                    break;

                case '3':
                    System.out.println("introduce el dinero a retirar");
                    double ingresar_ = sc.nextDouble();
                    if (ingresar_>0) {
                        cuenta1.retirardinero(ingresar_);
                    }else {
                        System.out.println("Importe debe ser mayor que cero");
                    }

                    break;

                case 'x':
                    System.out.println("saliendo del menu....");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

                if (opcion == 'x') {
                    break;
                }

            }

        }
    }

