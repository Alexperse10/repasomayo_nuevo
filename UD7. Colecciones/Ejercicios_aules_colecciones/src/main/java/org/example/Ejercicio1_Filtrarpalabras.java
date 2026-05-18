package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1_Filtrarpalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listapalabras = new HashSet<>();
        System.out.println("introduce una frase");
        String frase = sc.nextLine();

        String []frase_dividida  = frase.split(" ");

        System.out.println(Arrays.toString(frase_dividida)); // acordame que cuando hago el split si lo quiero imprimir tengo que utilizar Arrays.tostring


        for (String palabra : frase_dividida) {
            listapalabras.add(palabra);
        }

        System.out.println(listapalabras);


    }
}
