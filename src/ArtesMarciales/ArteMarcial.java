package ArtesMarciales;

import Strategy.Jugador;
import Strategy.StrategyArteMarcial;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public abstract class ArteMarcial implements StrategyArteMarcial {

    private String nombre;
    private String imagen;


    public ArteMarcial(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Ataque ataque(Jugador ataca, Jugador atacado){
        int index = ThreadLocalRandom.current().nextInt(0, 3);
        switch (index){
            case 1:
                return ataque1(ataca, atacado);
            case 2:
                return ataque2(ataca, atacado);
            case 3:
                return ataque3(ataca, atacado);
            default:
                return null;
        }
    }

    public abstract Ataque ataque1(Jugador ataca,Jugador atacado);
    public abstract Ataque ataque2(Jugador ataca,Jugador atacado);
    public abstract AtaqueEspecial ataque3(Jugador ataca,Jugador atacado);
}
