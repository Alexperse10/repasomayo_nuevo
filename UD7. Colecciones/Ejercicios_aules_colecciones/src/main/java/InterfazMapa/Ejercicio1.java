package InterfazMapa;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String [] frase_vect = frase.split(" ");
        System.out.println(Arrays.toString(frase_vect));
        
        for (int i =0; i<frase_vect.length; i++) {
            String palabra = frase_vect.toString();

        }
    }
}
