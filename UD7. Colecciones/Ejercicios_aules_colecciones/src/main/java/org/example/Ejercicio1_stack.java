package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pilaletras = new Stack<>();
        System.out.println("introduce las letras");
        for (int i =0; i<5; i++) {
            char letras = sc.next().charAt(0);
            pilaletras.push(letras);
        }

        System.out.println(pilaletras.isEmpty());

        System.out.println(pilaletras.size());

        System.out.println(pilaletras.peek()); // con stack y metodo peek se muestra el ultimo elemento

            while (!pilaletras.isEmpty()){ //cuidado no utilizar un for each si modifico la lista, es decir
                // no puede hace un for eac mientras voy modificando lista da error debes utilizar un while
                System.out.println(pilaletras.pop());


            }
        }
    }
