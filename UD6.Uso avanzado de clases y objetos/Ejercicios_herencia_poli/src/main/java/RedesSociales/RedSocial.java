package RedesSociales;

public class RedSocial {


    public static void main(String[] args) {
        Influencer influencer1 = new Influencer("Alex", 25,"monti",2000);
        Streamer streamer1 = new Streamer("fran",20,"gato",2500,29,20);
        Usuario usuario1 = new Usuario("raul",25,"spider",2650);
        Basico basico1 = new Basico("pedro",30,"carlangas",26854);
        influencer1.añadircolaboracion("rubius");
        influencer1.añadircolaboracion("vegetaa777");
        System.out.println(influencer1);


    }
}
