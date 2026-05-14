package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio8_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> listaclientes = new LinkedList<>(); // fifo
        System.out.println("Añade tres clientes");

        for (int i =0; i<3; i++) {
            String cliente = sc.nextLine();
            listaclientes.offer(cliente);
        }

        System.out.println(listaclientes.poll()); // saca al primero de la lista y lo muestra.
    }
}
