package RedesSociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String nombreusuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombreusuario, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreusuario = nombreusuario;
        this.seguidores = seguidores;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return
                "- nombre:" + nombre + "\n" +
                "- edad=" + edad + "\n"+
                "- nombreusuario=" + nombreusuario + "\n" +
                "- seguidores=" + seguidores ;
    }
}
