package Strategy;

import ArtesMarciales.Ataque;
import Strategy.Jugador;
import Strategy.StrategyAtaque;

import java.util.ArrayList;

public class AtaqueP2 extends StrategyAtaque {

    public AtaqueP2(Jugador jugador){
        super(jugador);
    }
    @Override
    public ArrayList<Ataque> ataque(Jugador jugador) {
        return  null;
    }
}


