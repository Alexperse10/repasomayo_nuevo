package Diccionario_Ingles_español;

import java.util.*;

public class Diccionario {
    static Map<String, String> Diccionario_ingles = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static void nuevopar(String español, String ingles) {
        Diccionario_ingles.put(español, ingles);
    }

    static String traduce(String español) {

        String traduccion_ingles = Diccionario_ingles.get(español);

        System.out.println("la palabra es: "+traduccion_ingles);

        return traduccion_ingles;
    }

    static String palabraAleatoria() {
        Random aleatorio = new Random();


        ArrayList<String> listapalabras = new ArrayList<>();

        Diccionario_ingles.keySet();

        listapalabras.addAll(Diccionario_ingles.keySet());

        int indice = aleatorio.nextInt(141) + 1;

        String palabra_aleatoria = listapalabras.get(indice);

        System.out.println("la palabra aleatoria es: "+palabra_aleatoria);

        return palabra_aleatoria;

    }

    static char primeraletraTraduccion (String palabra){
     String palabra_ =   Diccionario_ingles.get(palabra);
        char letra = palabra_.charAt(0);
        System.out.println(palabra+" :"+letra+"....");
        System.out.println("indique la respuesta correcta");
        String palabra_ingles = sc.nextLine();

        if (palabra_.equals(palabra_ingles)){
            System.out.println("Correcto");
        }else {
            System.out.println("lo siento no es correcto");
        }

        return letra;
    }




    public static void main(String[] args) {
        PalabrasDicc.cargarDiccionario();
       Diccionario_ingles.putAll(PalabrasDicc.cargarDiccionario());
//        System.out.println("introduce el nuevo par->castellano/ingles");
//        String castellano = sc.nextLine();
//        String ingles = sc.nextLine();
//        nuevopar(castellano,ingles);

        System.out.println("introduce la palabra a traducir");
        String palabra_traducir = sc.nextLine();
        traduce(palabra_traducir);

        System.out.println("introduce la palabra");
        String palabra_espa = sc.nextLine();
        primeraletraTraduccion(palabra_espa);

        palabraAleatoria();

    }


}