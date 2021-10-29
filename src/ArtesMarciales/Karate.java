package ArtesMarciales;
import Strategy.Jugador;

public class Karate extends ArteMarcial {

    public Karate(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado,"Karate chop", 20);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado,"Patada Frontal",35);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca, atacado,"Patada de Grulla",75, 30, 12);
        return  ataque;
    }

}
