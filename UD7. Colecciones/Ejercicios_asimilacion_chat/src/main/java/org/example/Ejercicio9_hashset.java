package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio9_hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> listanombres = new HashSet<>(); // el hash set elimina repetidos
        String nombre;
        for (int i =0; i<4; i++) {
            nombre = sc.nextLine();
            listanombres.add(nombre);
        }

        System.out.println(listanombres);

    }
}
