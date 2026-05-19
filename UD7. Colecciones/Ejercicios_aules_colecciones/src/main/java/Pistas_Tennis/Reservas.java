package Pistas_Tennis;

import java.time.LocalDateTime;

public class Reservas {
    private Usuarios usuario;
    private Pistas pista;
    private LocalDateTime fecha_hora;

    public Reservas(Usuarios usuario, Pistas pista){
        this.usuario = usuario;
        this.pista = pista;
        this.fecha_hora = LocalDateTime.now();
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Pistas getPista() {
        return pista;
    }

    public void setPista(Pistas pista) {
        this.pista = pista;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "usuario=" + usuario +
                ", pista=" + pista +
                ", fecha_hora=" + fecha_hora +
                '}';
    }
}
