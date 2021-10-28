package ArtesMarciales;

import Strategy.StrategyArteMarcial;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public abstract class ArteMarcial implements StrategyArteMarcial {

    private String nombre;
    private String imagen;


    public ArteMarcial(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Ataque ataque(){
        int index = ThreadLocalRandom.current().nextInt(0, 3);
        switch (index){
            case 1:
                return ataque1();
            case 2:
                return ataque2();
            case 3:
                return ataque3();
            default:
                return null;
        }
    }

    public abstract Ataque ataque1();
    public abstract Ataque ataque2();
    public abstract AtaqueEspecial ataque3();
}
