package ArtesMarciales;
import Strategy.Jugador;

public class KungFu extends ArteMarcial{

    public KungFu(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado, "Puños", 30);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca, atacado, "Kuan tsu",41);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca, atacado, "Pei tsu",45, 30, 14);
        return  ataque;
    }


}
