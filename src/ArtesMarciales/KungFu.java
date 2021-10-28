package ArtesMarciales;

public class KungFu extends ArteMarcial{

    public KungFu(String nombre, String imagen) {
        super(nombre, imagen);
    }

    public Ataque ataque1(){
        Ataque ataque = new Ataque("Puños", 30);
        return  ataque;
    }

    public Ataque ataque2(){
        Ataque ataque = new Ataque("Kuan tsu",41);
        return  ataque;
    }

    public AtaqueEspecial ataque3(){
        AtaqueEspecial ataque = new AtaqueEspecial("Pei tsu",45, 30);
        return  ataque;
    }


}
