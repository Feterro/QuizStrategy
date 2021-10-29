package ArtesMarciales;

import Strategy.Jugador;

public class Gatos extends ArteMarcial{

    public Gatos(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        return  new Ataque(ataca,atacado,"Garras de vibranium",45);
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Bola de pelos ácida", 26);
        return ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado) {
        AtaqueEspecial ataque = new AtaqueEspecial(ataca,atacado,"Garra ultra filosa asesina", 75, 30,41);
        return ataque;
    }
}
