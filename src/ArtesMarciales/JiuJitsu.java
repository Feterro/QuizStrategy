package ArtesMarciales;

public class JiuJitsu extends ArteMarcial {

    public JiuJitsu(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Armlock", 30);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Kimura Lock",41);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Mano de vaca lock",45, 30);
        return  ataque;
    }

}
