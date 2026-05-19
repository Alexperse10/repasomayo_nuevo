package InterfazMapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3_Registrotemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" *** REGISTRO DE TEMPERATURAS ***");
        Map<String, Integer> listaclimatologia = new HashMap<>();
        while (true) {
            System.out.println("Elige una opcion [insertar, actualizar, consultar, ver todas, salir]:");
            String opcion = sc.nextLine();
            switch (opcion){
                case "insertar":
                    System.out.println("insertar los datos nuevos (ciudad-temperatura");
                    String ciudad = sc.nextLine();

                    int temperatura = sc.nextInt();
                    sc.nextLine();
                    listaclimatologia.put(ciudad,temperatura);

                    break;

                case "actualizar":
                    System.out.println("insertar ciudad actualizacion");
                    ciudad = sc.nextLine();

                    if (listaclimatologia.containsKey(ciudad)){
                        System.out.println("introduce la temperatura");
                        temperatura = sc.nextInt();
                        listaclimatologia.put(ciudad,temperatura);
                        System.out.println("temperatura actualizada");
                    }else  {
                        System.out.println("la ciudad no esta registrada");
                    }

                    break;

                case "ver todas":
                    for (Map.Entry<String,Integer> entry : listaclimatologia.entrySet()){
                        System.out.println("clave :"+entry.getKey()+", valor"+entry.getValue());
                    }
                    break;
                case "consultar" :
                    System.out.println("introduce la ciudad");
                    ciudad = sc.nextLine();
                    if (listaclimatologia.containsKey(ciudad)){
                        System.out.println("la temperatura de la ciudad es"+listaclimatologia.get(ciudad));
                    }else {
                        System.out.println("la ciudad no se encuentra registrada");
                    }

                    break;
                case "salir":
                    System.out.println("saliendo del programa.....");
                    break;

                default:
                    System.out.println("opcion incorrecta");

            }
            if (opcion.equalsIgnoreCase("salir")){
                break;
            }
        }

    }
}
