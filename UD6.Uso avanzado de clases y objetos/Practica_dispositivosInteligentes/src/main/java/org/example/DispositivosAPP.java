package org.example;

import java.util.ArrayList;

public class DispositivosAPP {
    public static void main(String[] args) {
        ArrayList<Dispositivo> listadispositivo = new ArrayList<>();

        Televisor televisor1 = new Televisor("lg");
        ParlanteInteligente parlanteInteligente1 = new ParlanteInteligente("apollo");
        AireAcondicionado aireAcondicionado1 = new AireAcondicionado("general");

        listadispositivo.add(televisor1);
        listadispositivo.add(parlanteInteligente1);
        listadispositivo.add(aireAcondicionado1);

        for (Dispositivo dispositivo_ : listadispositivo) {
//            dispositivo_.apagar();
//            dispositivo_.encender();
//            dispositivo_.mostrarestado();
            dispositivo_.apagar();

        }

//        aireAcondicionado1.sincronicar();

    }

}
