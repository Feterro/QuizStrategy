package ArtesMarciales;

import Strategy.Jugador;

public class Boxeo extends ArteMarcial {

    public Boxeo(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Jab", 50);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Gancho",43);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca,atacado,"Uppercut",80, 30,23);
        return  ataque;
    }
}
