package ArtesMarciales;

public class Karate extends ArteMarcial {

    public Karate(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Karate chop", 20);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Patada Frontal",35);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Patada de Grulla",75, 30);
        return  ataque;
    }

}
