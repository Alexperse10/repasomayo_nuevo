package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4_listacompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> listacompra = new LinkedList<>();
        while (true) {


            System.out.println("---- Lista de la compra ----");
            System.out.println("1. Añadir producto al final ");
            System.out.println("2. Eliminar primer producto");
            System.out.println("3. Eliminar prodcto por nombre");
            System.out.println("4. ver primer producto");
            System.out.println("5. Buscar producto");
            System.out.println("6. Mostrar lista actual");
            System.out.println("x. salir");
            System.out.print(" Seleccione una opcion: ");
            char opcion = sc.nextLine().charAt(0);
            switch (opcion) {
                case '1':
                    System.out.print("Producto a añadir");
                    String producto = sc.nextLine();
                    listacompra.offerLast(producto);
                case '2':
                    while (!listacompra.isEmpty()) {
                        System.out.println("Producto a eliminar");
                        String productoeliminar = sc.nextLine();
                        listacompra.pollFirst();

                    }
                    if ()

            }
        }
    }
}