package Strategy;

import java.util.ArrayList;

public class StrategyManager {

    private static ArrayList<StrategyArteMarcial> artesMarciales = new ArrayList<>();

    public static StrategyArteMarcial getArteMarcial(int index) {
        return artesMarciales.get(index);
    }

}
