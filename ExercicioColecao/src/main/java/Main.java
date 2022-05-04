import inimigos.Inimigo;
import inimigos.FireKnight;
import inimigos.BlackKnight;
import inimigos.SilverKnight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        List<Inimigo> listaInimigo = new ArrayList<Inimigo>();

        listaInimigo.add(new FireKnight("Capirotin Tocha", 200));
        listaInimigo.add(new BlackKnight("Capiroto Black", 100));
        listaInimigo.add(new SilverKnight("Capiroto Silver", 150));

        Collections.sort(listaInimigo);

        for (Inimigo inimigo : listaInimigo) {
            System.out.println(inimigo.getVida());
        }

    }

}