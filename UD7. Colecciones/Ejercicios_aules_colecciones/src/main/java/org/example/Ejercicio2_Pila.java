package org.example;

import java.sql.ClientInfoStatus;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2_Pila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilanumeros = new Stack<>();
        System.out.println("introduce el primer numero");
        int numero1 = sc.nextInt();
        pilanumeros.push(numero1);
        System.out.println("Introduce el segundo numero");
        int numero2 = sc.nextInt();
        pilanumeros.push(numero2);
        System.out.println("introduce el tercer numero");
        int numero3 = sc.nextInt();
        pilanumeros.push(numero3);

        while (!pilanumeros.isEmpty()) {
            System.out.println(pilanumeros.pop());
        }
    }


}
