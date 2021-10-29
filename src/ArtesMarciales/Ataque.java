package ArtesMarciales;

import Strategy.Jugador;

public class Ataque {

    private int dano;
    protected String nombre;
    protected Jugador ataca;
    protected Jugador atacado;


    public Ataque(Jugador ataca,Jugador atacado,String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
        this.ataca = ataca;
        this.atacado = atacado;
    }

    public void apply(){
        danar();
    }

    public void danar(){
        atacado.recibirDano(dano);
    }

    public int getDano() {
        return dano;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return nombre;
    }
}
