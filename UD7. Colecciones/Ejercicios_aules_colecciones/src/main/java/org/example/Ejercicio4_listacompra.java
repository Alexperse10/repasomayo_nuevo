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
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Producto a añadir");
                    String producto = sc.nextLine();
                    listacompra.offerLast(producto);

                    break;
                case "2":
                    if (listacompra.isEmpty()) {
                        System.out.println("Lista vacia no se puede eliminar nada");
                    } else {

                        listacompra.pollFirst();

                    }
                    break;

                case "3":


                    if (listacompra.isEmpty()){
                        System.out.println("La lista esta vacia");
                    } else  {
                        System.out.println("Eliminar producto");
                        String nombre_eliminar = sc.nextLine();
                        if (!listacompra.contains(nombre_eliminar)) {
                            System.out.println("el nombre del producto no se encuenta en la lista");
                        }else {
                            listacompra.remove(nombre_eliminar);
                            System.out.println("producto eliminado con exito");
                        }



                    }

                    break;

                case "4":
                    System.out.println("el primer producto es: "+listacompra.peek());

                    break;

                case "5":
                    System.out.println("Introduce el producto a buscar");
                    String producto_busc = sc.nextLine();
                    if (listacompra.isEmpty()){
                        System.out.println("Lo siento la lista esta vacia");
                    }else {
                        if (listacompra.contains(producto_busc)){
                            System.out.println("El producto esta en la lista ");
                        }else {
                            System.out.println("el producto no esta en la lista");                        }
                    }

                    break;
                case "6":
                    System.out.println("la lista es"+listacompra);

                    break;

                case "x":
                    System.out.println("saliendo del programa");

                    break;

                default:
                    System.out.println("La opcion es incorrecta");
            }

            if (opcion.equalsIgnoreCase( "x")){
                break;
            }
        }
    }
}