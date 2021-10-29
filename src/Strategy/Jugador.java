package Strategy;

import ArtesMarciales.ArteMarcial;
import ArtesMarciales.Ataque;
import Strategy.StrategyArteMarcial;
import Strategy.StrategyAtaque;
import Strategy.StrategyManager;
import Vista.AttackStrategiesEnum;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {

    public StrategyArteMarcial[] artesMarciales;
    private StrategyAtaque estrategiaAtaque;
    public StrategyArteMarcial arteMarcialActual;
    private int vida;
    public Jugador enemigo;

    public Jugador(AttackStrategiesEnum attackType,Jugador enemigo){
        this.vida = 200;
        this.enemigo = enemigo;
        reasignarArtesMarciales();
        switch (attackType){
            case PLAYER1:
                this.estrategiaAtaque = new AtaqueP1(this);
            case PLAYER2:
                this.estrategiaAtaque = new AtaqueP2(this);
        }
    }

    public void reasignarArtesMarciales(){
        this.artesMarciales = new StrategyArteMarcial[3];
        Random rand = new Random();
        for(int i = 0;i<3;i++){
            int index = rand.nextInt((0 - artesMarciales.length) + 1);
            artesMarciales[i] = StrategyManager.getArteMarcial(index);
        }
    }

    public ArrayList<Ataque> getCombo(){
        return estrategiaAtaque.ataque();
    }

    public String recibirAtaques(ArrayList<Ataque> ataques){
        String comboString = "";
        for (Ataque ataque:ataques) {
            ataque.apply();
            comboString += ataque.toString();
        }
        return  comboString;
    }

    public void cura(int cura) {
        this.vida += cura;
    }

    public void recibirDano(int dano) {
        this.vida -= dano;
    }


    //Desde pantalla
    //Cuando se toca generar combo => ataques1 = getCombo() , ataques2 = getCombo()
    //Cuando se ataca => Jugador1.recibirAtaques(ataques2)
    //Jugador2.recibirAtaques(ataque1)
    //Tomar en cuenta que ya se tiene el enemigo adentro...
}
