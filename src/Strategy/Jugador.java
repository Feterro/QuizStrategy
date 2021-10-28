package Strategy;

import ArtesMarciales.Ataque;
import Strategy.StrategyArteMarcial;
import Strategy.StrategyAtaque;
import Strategy.StrategyManager;
import Vista.AttackStrategiesEnum;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {

    private StrategyArteMarcial[] artesMarciales;
    private StrategyAtaque estrategiaAtaque;
    public StrategyArteMarcial arteMarcialActual;
    private int vida;

    public Jugador(AttackStrategiesEnum attackType){
        this.vida = 200;
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
        int total = 0;
        for (Ataque ataque:ataques) {
            total += ataque.getDano();
            comboString += ataque.toString();
        }
        return  comboString;
    }

    //Pantalla
    //Jugador1
    //Jugador2
    //Jugador2.recibirDano(Jugador1.getCombo())

}
