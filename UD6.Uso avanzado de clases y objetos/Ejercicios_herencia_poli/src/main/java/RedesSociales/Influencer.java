package RedesSociales;

import java.util.ArrayList;

public class Influencer extends Usuario{
    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreusuario, int seguidores) {
        super(nombre, edad, nombreusuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    public void añadircolaboracion (String colaboracion) {
        colaboraciones.add(colaboracion);
    }


    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }


    @Override
    public String toString() {
        return super.toString() +"\n"+
                "- colaboraciones=" + colaboraciones;
    }
}
