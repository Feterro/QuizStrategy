package ArtesMarciales;

import Strategy.Jugador;

public class Judo extends ArteMarcial {

    public Judo(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado,"Uki-Goshi Throw", 26);
        return ataque;
    }
    public  Ataque ataque2(Jugador ataca, Jugador atacado) {
        Ataque ataque = new Ataque(ataca, atacado,"Rear naked Choke", 45);
        return ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca, atacado,"Mano de vaca lock",75, 30, 4);
        return  ataque;
    }
}
