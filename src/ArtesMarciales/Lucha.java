package ArtesMarciales;

import Strategy.Jugador;

public class Lucha extends ArteMarcial {
    public Lucha(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado,"Armbreaker", 20);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado,"Arm triangle",42);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca, atacado, "Triangle choke",46, 12, 23);
        return  ataque;
    }
}
