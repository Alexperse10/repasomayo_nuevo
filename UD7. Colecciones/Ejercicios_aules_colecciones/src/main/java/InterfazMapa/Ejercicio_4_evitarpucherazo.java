package InterfazMapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_4_evitarpucherazo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> listamapa = new HashMap<>();
        System.out.println("introducir los nombres de los condidatos");
        while (true) {

            String candidatos = sc.nextLine();

            if (candidatos.equalsIgnoreCase("fin")) {
                break;
            }
             if (listamapa.containsKey(candidatos)){
                 int numero = listamapa.get(candidatos);
                 listamapa.put(candidatos,numero+1);
             }else {
                 listamapa.put(candidatos,1);
             }

            }
        System.out.println("resultados");
        for (Map.Entry<String,Integer> mapa : listamapa.entrySet()) {
            System.out.println(mapa.getKey()+" : "+mapa.getValue());
        }
        }
    }

