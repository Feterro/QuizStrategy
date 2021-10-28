package ArtesMarciales;

public class Boxeo extends ArteMarcial {

    public Boxeo(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Jab", 50);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Gancho",43);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Uppercut",80, 30);
        return  ataque;
    }
}
