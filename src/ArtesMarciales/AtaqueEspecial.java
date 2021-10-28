package ArtesMarciales;

public class AtaqueEspecial extends Ataque{
    private int vida;

    public AtaqueEspecial(String nombre, int dano, int vida) {
        super(nombre, dano);
        this.vida = vida;
    }
}
