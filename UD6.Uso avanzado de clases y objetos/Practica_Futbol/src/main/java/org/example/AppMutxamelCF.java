package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMutxamelCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador jugador1 = new Jugador("alex", 25, Equipos.SENIOR, Posiciones.DELANTERO, 10);
        Jugador jugador2 = new Jugador("manu", 30, Equipos.SENIOR, Posiciones.PORTERO, 1);
        Jugador jugador3 = new Jugador("fede", 28, Equipos.SENIOR, Posiciones.CENTROCAMPISTA, 6);
        Jugador jugador4 = new Jugador("raul", 13, Equipos.SENIOR, Posiciones.DEFENSA, 9);

        Entrenador entrenador = new Entrenador("flick", 39, Equipos.SENIOR, "4-4-3");

        Acompañante acompañante1 = new Acompañante("juanjo", 25, "padre", jugador1);


        ArrayList<Jugador> listajugadores = new ArrayList<>();


        System.out.println("=== APP MANTENIMIENTO DEL MUTXAMEL FC ====");
        System.out.println("[1] Mantenimiento de jugadores");
        System.out.println("dentro podremos añadir jugadores, modificar datos y añadir acompañantes");
        System.out.println("[2] Mantenimiento de entrenadores");
        System.out.println("Dentro podremos añadir entrenadores y modificar sus datos");
        System.out.println("[3] Mantenimiento masajistas");
        System.out.println("Dentro podremos añadir masajistas y modificar sus datos");
        System.out.println("[4] Consultar equipos");
        System.out.println("dentro se deben listar los tipos del club y elegir uno");
        System.out.println("[x] Salir");

        System.out.print("Selecciona un opcion -->");
        char opcion = sc.nextLine().charAt(0);

        switch (opcion) {
            case '1':
                while (true) {
                    System.out.println("=== Mantenimiento de jugadores ===");
                    System.out.println("[1] Añadir nuevo jugador");
                    System.out.println("[2] Modificar datos de jugador existente");
                    System.out.println("[3] Crear acompañantes (solo senior)");
                    System.out.println("[x] volver al menu principal");
                    System.out.println("Introduce la opcion deseada");
                    char opcion_ = sc.nextLine().charAt(0);

                    switch (opcion_) {
                        case '1':
                            System.out.println("introduce el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("introduce la edad");
                            int edad = sc.nextInt();
                            sc.nextLine();
                            System.out.println("introduce la categoria");
                            String categoriatexto = sc.nextLine().toUpperCase();
                            Equipos equipo = Equipos.valueOf(categoriatexto);
                            System.out.println("introduce la posicion");
                            String posicion_texto = sc.nextLine().toUpperCase();
                            Posiciones posiciones = Posiciones.valueOf(posicion_texto);
                            System.out.println("introduce el dorsal");
                            int dorsal = sc.nextInt();
                            sc.nextLine();
                            listajugadores.add(new Jugador(nombre,edad,equipo,posiciones,dorsal));

                            break;
                        case '2':


                            System.out.println("De que jugador quieres hacer los cambios ");
                            int contador =0;
                            for (Jugador jugador_ : listajugadores) {
                                contador++;
                                System.out.println(contador+", "+jugador_);
                            }
                            break;
                    }

                }

        }
    }
}