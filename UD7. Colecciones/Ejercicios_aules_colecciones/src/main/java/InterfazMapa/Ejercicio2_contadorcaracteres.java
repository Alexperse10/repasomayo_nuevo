package InterfazMapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2_contadorcaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contadorpalabras = new HashMap<>();
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (contadorpalabras.containsKey(letra)) {
                int numero = contadorpalabras.get(letra);
                contadorpalabras.put(letra, numero + 1);

            } else {
                contadorpalabras.put(letra, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : contadorpalabras.entrySet()) {
            System.out.println("clave: " + entry.getKey() + ", valor: " + entry.getValue());
        }
    }
}
