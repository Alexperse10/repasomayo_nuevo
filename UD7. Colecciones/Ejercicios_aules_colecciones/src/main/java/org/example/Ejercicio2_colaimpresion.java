package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio2_colaimpresion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> colaimpresion = new LinkedList<>();

        for (int i =0; i<4; i++) {
            System.out.println("insetar documento "+(i+1)+" a imprimir");
            String documentos = sc.nextLine();
            colaimpresion.offer(documentos);
        }
        System.out.println("Estado inicial de la cola de impresion : "+colaimpresion);


        while (!colaimpresion.isEmpty()) {
            System.out.println("Procesando Documento "+colaimpresion.poll());
            System.out.println(colaimpresion);
        }
        System.out.print("no hay mas trabajos que imprimir");
        }




    }

