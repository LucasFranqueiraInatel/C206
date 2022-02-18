public class Jogador {

    float vida = 100;
    float mp = 100;
    boolean morto = false;
    float dano = 25;
    float spealDamage = 11.5;

    void setAtack(Zumbi zumbiAlvo, float dano){
        System.out.println("Zumbi "+ zumbiAlvo + " tomaou na boca"+ dano + " de dano");
    }

    void fireBoll(Zumbi zumbiAlvo, float dano){
        System.out.println("");
    }

    void correr(){

    }



}
