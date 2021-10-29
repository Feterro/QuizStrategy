package ArtesMarciales;


import Strategy.Jugador;

public class Bananazos extends ArteMarcial {

    public Bananazos(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Pichazo Banano", 30);
        return  ataque;
    }

    public Ataque ataque2(Jugador ataca, Jugador atacado){
        Ataque ataque = new Ataque(ataca,atacado,"Pichazo Platano",70);
        return  ataque;
    }

    public AtaqueEspecial ataque3(Jugador ataca, Jugador atacado){
        AtaqueEspecial ataque = new AtaqueEspecial(ataca,atacado,"Comerse un banano",75, 30,3);
        return ataque;
    }



}