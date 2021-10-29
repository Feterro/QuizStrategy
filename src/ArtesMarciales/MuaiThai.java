package ArtesMarciales;

import Strategy.Jugador;

public class MuaiThai extends ArteMarcial{
    public MuaiThai(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Codazo", 11);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Middle kick",10);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca,atacado,"High Kick",24, 0,2);
        return  ataque;
    }
}
