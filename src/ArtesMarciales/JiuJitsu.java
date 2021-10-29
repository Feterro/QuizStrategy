package ArtesMarciales;

import Strategy.Jugador;

public class JiuJitsu extends ArteMarcial {

    public JiuJitsu(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Armlock", 30);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque( ataca, atacado, "Kimura Lock",41);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca,atacado,"Mano de vaca lock",45, 30,0);
        return  ataque;
    }

}
