package org.example;

public class JuegosInviernoApp {
    public static void main(String[] args) {
        Deportista olivia_smart = new Deportista("olivia smart",1,4,1997);
        olivia_smart.inscribirse("patinaje artistico");
        Deportista nil_llop = new Deportista("nil llop", 20,9,2002);
        nil_llop.inscribirse("patinaje de velocidad");
        Deportista nora_cornell = new Deportista("nora cornell", 2, 9, 2005);
        nora_cornell.inscribirse("snowboard");
        nora_cornell.inscribirse("big air");

        Equipo españa = new Equipo("españa");

        españa.inscribirdeportistas(olivia_smart);
        españa.inscribirdeportistas(nora_cornell);
        españa.inscribirdeportistas(nil_llop);

        System.out.println(españa);

        nora_cornell.setMedallas(2);

        nil_llop.setMedallas(1);



        nora_cornell.vermodalidades();


        System.out.println(" " +españa.getPais()+ "ha conseguido "+españa.medallastotales()+ "medallas");

        españa.vermedallero();

        System.out.println("el deportista de "+españa.getPais()+ " que mas medallas ha ganado es "+españa.deportistaTOP().getNombre());


        System.out.println("el deportista mas joven de" +españa.getPais()+ " es " +españa.deportistamasjoven().getNombre());


    }
}
