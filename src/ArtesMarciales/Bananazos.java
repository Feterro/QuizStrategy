package ArtesMarciales;


public class Bananazos extends ArteMarcial {

    public Bananazos(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Pichazo Banano", 30);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Pichazo Platano",70);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Pichazo premium",75, 30);
        return  ataque;
    }
}