package org.example;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3_historialNav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> listahistorial = new LinkedHashSet<>();
        int contador = 0;
        while (true) {
            System.out.print("Escribe una URL vistada(o salir para terminar: ");
            String web = sc.nextLine();




            if (web.equalsIgnoreCase("salir")) {
                break;

            }
            listahistorial.add(web);

        }
        System.out.println("Historial de navegacion");
        for (String lista : listahistorial) {
            contador++;
            System.out.println(contador + ". " + lista);


        }
    }
}
