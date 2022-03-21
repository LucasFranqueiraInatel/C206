package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;
import lombok.Data;

@Data
public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        String g = "grande";
        String n = "normal";
        System.out.println("O "+ ast.getNome()+" foi fuzilado pela "+ this.nome);
        if(ast.getTipoAsteroide().equals("grande")){
            if(this.getTipoTiro().equals(n)){
                System.out.println("A nave "+ this.nome+ " não conseguiu destroir o " + ast.getNome());
            }
            else
                ast.destruir();
        }
        else
            ast.destruir();
    }
}
