package ArtesMarciales;

public class MuaiThai extends ArteMarcial{
    public MuaiThai(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Codazo", 11);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Middle kick",10);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("High Kick",24, 15);
        return  ataque;
    }
}
