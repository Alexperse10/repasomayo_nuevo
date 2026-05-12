package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.WeakHashMap;

public class AppMutxamelCF {
    public static void main(String[] args) throws FormacionPreferida, MismoDorsalExcepcion {
        Scanner sc = new Scanner(System.in);
        Jugador jugador1 = new Jugador("alex", 25, Equipos.SENIOR, Posiciones.DELANTERO, 10);
        Jugador jugador2 = new Jugador("manu", 30, Equipos.SENIOR, Posiciones.PORTERO, 1);
        Jugador jugador3 = new Jugador("fede", 28, Equipos.SENIOR, Posiciones.CENTROCAMPISTA, 6);
        Jugador jugador4 = new Jugador("raul", 13, Equipos.SENIOR, Posiciones.DEFENSA, 9);

        Entrenador entrenador = new Entrenador("flick", 39, Equipos.SENIOR, "4-4-3");

        Acompañante acompañante1 = new Acompañante("juanjo", 25, "padre", jugador1);


        ArrayList<Jugador> listajugadores = new ArrayList<>();
        ArrayList<Acompañante> listaacompañante = new ArrayList<>();
        while (true) {
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
                                try {
                                    for (Jugador jugador_ : listajugadores) {
                                        if (jugador_.getDorsal() == dorsal) {
                                            throw new MismoDorsalExcepcion(); // primero compruebo toda la lista y despues lo añado, porque si el primero que comprueba es diferente lo añado sin comprabar los demas
                                        }

                                    }
                                    listajugadores.add(new Jugador(nombre, edad, equipo, posiciones, dorsal));

                                } catch (MismoDorsalExcepcion excepcion) {
                                    System.out.println(excepcion.getMessage());
                                }


                                break;


                            case '2':


                                System.out.println("De que jugador quieres hacer los cambios ");
                                int contador = 0;
                                for (Jugador jugador_ : listajugadores) {
                                    contador++;
                                    System.out.println(contador + ", " + jugador_);

                                }
                                System.out.println("========================================");
                                System.out.println("selecciona una opcion");
                                int opcion_jugador = sc.nextInt();
                                sc.nextLine();
                                Jugador jugador_seleccionado = listajugadores.get(opcion_jugador - 1);

                                System.out.println("que quieres modificar? [nombre, edad, categoria, dorsal, posicion]");
                                String opcion_tipo = sc.nextLine();


                                if (opcion_tipo.equalsIgnoreCase("nombre")) {
                                    System.out.println("Introduce el nuevo nombre");
                                    String nombre_nuevo = sc.nextLine();
                                    jugador_seleccionado.setNombre(nombre_nuevo);
                                } else if (opcion_tipo.equalsIgnoreCase("edad")) {
                                    System.out.println("introduce una nueva edad");
                                    int edad_nueva = sc.nextInt();
                                    sc.nextLine();
                                    jugador_seleccionado.setEdad(edad_nueva);
                                } else if (opcion_tipo.equalsIgnoreCase("categoria")) {
                                    System.out.println("introduce categoria");
                                    String categoria_nuevo = sc.nextLine();
                                    jugador_seleccionado.setCategoria(Equipos.valueOf(categoria_nuevo));
                                } else if (opcion_tipo.equalsIgnoreCase("dorsal")) {
                                    try {
                                        System.out.println("introduce dorsal");
                                        int dorsal_nuevo = sc.nextInt();
                                        sc.nextLine();
                                        for (Jugador jugador_ : listajugadores) {
                                            if (jugador_.getDorsal() == dorsal_nuevo) {
                                                throw new MismoDorsalExcepcion();
                                            }
                                        }
                                        jugador_seleccionado.setDorsal(dorsal_nuevo);

                                    } catch (MismoDorsalExcepcion excepcion) {
                                        System.out.println(excepcion.getMessage());
                                    }

                                } else if (opcion_tipo.equalsIgnoreCase("posicion")) {
                                    System.out.println("introduce una posicion nueva");
                                    String nuevopos = sc.nextLine();
                                    jugador_seleccionado.setPosicion(Posiciones.valueOf(nuevopos));
                                } else {
                                    System.out.println("la opcion es incorrecta");
                                }


                                break;


                            case '3':
                                System.out.println("Creo acompañantes de los jugadores");
                                System.out.println("introduce nombre");
                                String nombre_acompa = sc.nextLine();
                                System.out.println("introduce la edad");
                                int edad_acompañante = sc.nextInt();
                                sc.nextLine();
                                System.out.println("introduce el parentesco");
                                String parentesco = sc.nextLine();
                                System.out.println("selecciona al jugador");
                                int contador_ = 0;
                                for (Jugador jugador_ : listajugadores) {
                                    contador_++;
                                    System.out.println(contador_ + ", " + jugador_);

                                }
                                int indice_jugador = sc.nextInt();
                                sc.nextLine();
                                Jugador jugador = listajugadores.get(indice_jugador - 1);
                                Acompañante nuevo_acompañante = new Acompañante(nombre_acompa, edad_acompañante, parentesco, jugador);
                                listaacompañante.add(nuevo_acompañante);

                                break;

                            case 'x':
                                System.out.println("Saliendo del programa....");
                                break;
                            default:
                                System.out.println("opcion incorrecta");
                        }
                        if (opcion_ == 'x') {
                            break;
                        }
                    }

            }
            if (opcion == 'x'){
                break;

            }
        }
    }
    }

