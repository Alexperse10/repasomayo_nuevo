package RedesSociales;

public class Streamer extends Usuario{
        private int numero_retransmisiones;
        private int horas_directo;

    public Streamer(String nombre, int edad, String nombreusuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombreusuario, seguidores);
        this.horas_directo = horas_directo;
        this.numero_retransmisiones = numero_retransmisiones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    public int getNumero_retransmisiones() {
        return numero_retransmisiones;
    }

    public void setNumero_retransmisiones(int numero_retransmisiones) {
        this.numero_retransmisiones = numero_retransmisiones;
    }

    @Override
    public String toString() {
        return
                "- numero_retransmisiones=" + numero_retransmisiones +
                "- horas_directo=" + horas_directo;
    }
}
