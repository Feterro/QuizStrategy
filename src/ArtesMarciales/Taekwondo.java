package ArtesMarciales;

import Strategy.Jugador;

public class Taekwondo extends ArteMarcial {
    public Taekwondo(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado,"Ap chagui", 16);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado, "Yop chagui",25);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca, atacado, "Roundhouse Kick",26, 14, 15);
        return  ataque;
    }
}
