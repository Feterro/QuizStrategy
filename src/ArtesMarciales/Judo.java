package ArtesMarciales;

public class Judo extends ArteMarcial {

    public Judo(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Uki-Goshi Throw", 26);
        return ataque;
    }
    public  Ataque ataque2() {
        Ataque ataque = new Ataque("Rear naked Choke", 45);
        return ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Mano de vaca lock",75, 30);
        return  ataque;
    }
}
