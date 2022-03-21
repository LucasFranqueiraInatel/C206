package br.inatel.cdg.inimigo;

import lombok.Data;

@Data
public class Asteroide {

    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir(){
        System.out.println("Asteroide "+ this.getNome() +" foi destruido!!!");


    }

}
