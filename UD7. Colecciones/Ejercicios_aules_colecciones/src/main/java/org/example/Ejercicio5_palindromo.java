package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5_palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> listapalindromo = new LinkedList<>();
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine();

        for (int i =0; i<palabra.length(); i++){
            char letras = palabra.charAt(i);
            listapalindromo.offer(letras);
        }
        System.out.println(listapalindromo);
        boolean espalindro = true;
        while (listapalindromo.size()>1) {
            if (listapalindromo.peekFirst()==listapalindromo.peekLast()){
                listapalindromo.pollFirst();
                listapalindromo.pollLast();
                espalindro = true;
            }else {
                espalindro = false;
                break;
            }

            }
        if (espalindro){
            System.out.println("es palindro");
        }else {
            System.out.println("no es palindro");
        }
        }

    }

