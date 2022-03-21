package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;
import lombok.Data;

@Data
public class Main {

    public static void main(String[] args) {
        Nave nave1 = new Nave("NaveMerda", 120, "normal");
        Nave nave2 = new Nave("NaveFoda", 120,"explosivo");
        Asteroide ast = new Asteroide("asteroidao", "grande");

        nave1.atirar(ast);
        nave2.atirar(ast);





    }
}
