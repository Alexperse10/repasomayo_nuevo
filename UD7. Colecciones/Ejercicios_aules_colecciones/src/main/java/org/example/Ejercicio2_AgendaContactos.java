package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2_AgendaContactos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listacontactos = new TreeSet<>();
        while (true) {
            System.out.println("---- AGENDA ------");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4.Eliminar contacto");
            System.out.println("x.Salir");

            System.out.print("elige una opcion: ");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Introduce el nuevo contacto");
                    String contacto_nuevo = sc.nextLine();
                    listacontactos.add(contacto_nuevo);
                    break;
                case "2":
                    System.out.println("Los contacto son");
                    System.out.println(listacontactos);
                    break;

                case "3":
                    System.out.println("Introduce el nombre a buscar: ");
                    String nombre_buscar = sc.nextLine();
                    if (!listacontactos.contains(nombre_buscar)){
                        System.out.println("El contacto no se encuentra en la lista");
                    }else {
                        System.out.println(" El contacto se encuentra en la lista");

                    }
                    break;
                case "4":
                    System.out.println("Eliminar un elemento");
                    String contacto_borrar = sc.nextLine();
                    if (listacontactos.contains(contacto_borrar)){
                        listacontactos.remove(contacto_borrar);
                    }else {
                        System.out.println("El contacto no esta en la lista");
                    }

                    break;
                case "x":
                    System.out.println("saliendo del programa");
                    break;

                default:
                    System.out.println("opcion incorrecta");
            }
            if (opcion.equalsIgnoreCase("x")){
                break;
            }
        }
    }
}