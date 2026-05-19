package InterfazMapa;

import Ejercicio_funcionario.Informe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String [] frase_vect = frase.split(" ");
        System.out.println(Arrays.toString(frase_vect));
        Map<String, Integer> contadorpalabras = new HashMap<>();

        for (int i =0; i<frase_vect.length; i++) {
            int contador =0;
            String palabra = frase_vect[i];
                if (contadorpalabras.containsKey(palabra)){ // si contiene la palabra entre en el if
                   int numero = contadorpalabras.get(palabra); // variable numerica, devuelve el valor asociado a hola, si hola tiene un value de 1, devuelve 1
                    contadorpalabras.put(palabra,numero+1); // entonces cojes y haces introduces palabra mas la suma
                }else {
                    contadorpalabras.put(palabra,1);
                }
            }

        for (Map.Entry<String,Integer> entry : contadorpalabras.entrySet()) {
            System.out.println("clave: "+entry.getKey()+", valor: "+entry.getValue());
        }

    }
}
