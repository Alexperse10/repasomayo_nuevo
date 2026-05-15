package org.example;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio1_Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> cola = new LinkedList<>();
        for (int i =0; i<5; i++){
            System.out.println("introduce 5 letras");
            char letras = sc.nextLine().charAt(0);
            cola.offer(letras);
        }

        System.out.println(cola.isEmpty());
        System.out.println(cola.size());
        System.out.println(cola.peek());
        while (!cola.isEmpty()) {
            System.out.print(cola.poll());

        }

    }


}
