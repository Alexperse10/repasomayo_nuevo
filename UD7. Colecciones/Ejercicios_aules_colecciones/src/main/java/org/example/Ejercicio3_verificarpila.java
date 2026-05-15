package org.example;

import java.util.Formattable;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3_verificarpila {
    static Scanner sc = new Scanner(System.in);
    static Stack<Character> listacaracteres = new Stack<>();

    static public boolean esbalanceado(String expresion) {

        for (int i = 0; i < expresion.length(); i++) {
            char valor_caracter = expresion.charAt(i);
            if (valor_caracter == '(') {
                listacaracteres.push(valor_caracter);


            }
            if (valor_caracter == ')') {
                if (listacaracteres.isEmpty()) {
                    return false;
                }
                if (listacaracteres.peek() == '(') {
                    listacaracteres.pop();

                }

            }

        }
        return true;
    }


        public static void main (String[]args){
            System.out.println("introduce la expresion");
            String expresion = sc.nextLine();
            if (esbalanceado(expresion)) {
                System.out.println("es correcto");

            } else {
                System.out.println("es incorrecto");
            }

        }
    }







