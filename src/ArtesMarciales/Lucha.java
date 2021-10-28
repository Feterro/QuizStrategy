package ArtesMarciales;

public class Lucha extends ArteMarcial {
    public Lucha(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Armbreaker", 20);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Arm triangle",42);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Triangle choke",46, 12);
        return  ataque;
    }
}
