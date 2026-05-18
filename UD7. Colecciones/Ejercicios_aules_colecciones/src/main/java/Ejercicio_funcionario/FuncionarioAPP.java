package Ejercicio_funcionario;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FuncionarioAPP {
    static Queue<Informe> listainformes = new LinkedList<>();
    static public void añadirinforme(Informe informe) {
        listainformes.add(informe);
    }
    static public void eliminarinforme() {
        while (!listainformes.isEmpty()){
           System.out.println(listainformes.remove());

        }
    }

    static public void cantidadtareas (){
        int contador =0;
        Set<Informe> informes_reps = new HashSet<>();
        for (Informe list : listainformes) {
            informes_reps.add(list);

        }
        for (Informe list_ : informes_reps){
            contador++;
        }
            System.out.println("la cantidad de tareas son "+contador);
        }



    public static void main(String[] args) {

        Informe inform1 = new Informe(54789,Descripcion.ADMINISTRATIVO);
        Informe informe2 = new Informe(7896,Descripcion.PERSONAL);
        Informe informe3 = new Informe(4789, Descripcion.EMPRESARIAL);
        Informe informe4 = new Informe(54789,Descripcion.ADMINISTRATIVO);
        Informe informe5 = new Informe(7896, Descripcion.ADMINISTRATIVO);

        System.out.println("Se insertan estos informes");
        añadirinforme(inform1);
        añadirinforme(informe2);
        añadirinforme(informe3);
        añadirinforme(informe4);
        añadirinforme(informe5);
        System.out.println(listainformes);

        cantidadtareas();
        System.out.println("Se despañan estos informes");
        eliminarinforme();


    }
}
