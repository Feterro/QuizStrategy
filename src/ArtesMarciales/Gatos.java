package ArtesMarciales;

public class Gatos extends ArteMarcial{

    public Gatos(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        return  new Ataque("Garras de vibranium",45);
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Bola de pelos ácida", 26);
        return ataque;
    }

    public AtaqueEspecial ataque3() {
        AtaqueEspecial ataque = new AtaqueEspecial("Garra ultra filosa asesina", 75, 30);
        return ataque;
    }
}
