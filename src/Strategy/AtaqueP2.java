package Strategy;

import ArtesMarciales.Ataque;
import Strategy.Jugador;
import Strategy.StrategyAtaque;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AtaqueP2 extends StrategyAtaque {

    public AtaqueP2(Jugador jugador){
        super(jugador);
    }

    @Override
    public ArrayList<Ataque> ataque() {
        ArrayList<Ataque> ataques = new ArrayList<>();
        int numeroDeAtaques = ThreadLocalRandom.current().nextInt(3, 6);
        for (int i = 0;i<numeroDeAtaques;i++){
            int arteMarcialIndex = ThreadLocalRandom.current().nextInt(0, 3);
            ataques.add(jugador.artesMarciales[arteMarcialIndex].ataque(jugador,jugador.enemigo));
        }
        return ataques;
    }
}


