package ArtesMarciales;

public class Taekwondo extends ArteMarcial {
    public Taekwondo(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Ap chagui", 16);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Yop chagui",25);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Roundhouse Kick",26, 14);
        return  ataque;
    }
}
