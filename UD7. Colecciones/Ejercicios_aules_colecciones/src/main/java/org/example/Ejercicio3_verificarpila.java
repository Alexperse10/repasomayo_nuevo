package org.example;

import java.util.Formattable;
import java.util.Stack;

public class Ejercicio3_verificarpila {

    static public boolean esbalanceado(String expresion) {

        return true;
    }

    public static void main(String[] args) {
        String valor = "((2+3)*(5-1))";
        Stack<Character> listacaracteres = new Stack<>();

        for (int i = 0; i < valor.length(); i++) {
            char valor_caracter = valor.charAt(i);
            if (valor_caracter == '(') {
                listacaracteres.push(valor_caracter);
            }
            if (valor_caracter==')'){
              if (listacaracteres.peek() == '(') {
                  
              }

                }
            }
        }

    }



