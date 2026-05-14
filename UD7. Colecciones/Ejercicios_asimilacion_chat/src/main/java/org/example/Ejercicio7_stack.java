package org.example;

import java.util.Stack;

public class Ejercicio7_stack {
    public static void main(String[] args) {
        Stack<String> listalibros = new Stack<>();
        listalibros.push("principito");
        listalibros.push("harry potter");
        listalibros.push("1890");
        //stack lifo
        //push añadir, pop eliminar, peek mirar el superior
        System.out.println(listalibros.peek()); // con peek muestro el ultimo libro introducido
        System.out.println(listalibros.pop()); // // eliminar/optener
        System.out.println(listalibros.peek()); // con el peek muestro el libro ultimo libro

        System.out.println("la pila mostrada es"+listalibros);

        String indice="";
        for (int i =0; i<listalibros.size(); i++) {
            indice = listalibros.get(0);

        }
        System.out.println(indice);





    }
}
