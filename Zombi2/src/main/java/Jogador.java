public class Jogador {

    float vida = 100f;
    float mp = 100f;
    boolean morto = false;
    float dano = 25f;
    float spellDamage = 11.5f;

    void setAtack(Zumbi zumbiAlvo){
        System.out.println("Zumbi "+ zumbiAlvo.nome + " tomaou na boca "+ dano + " de dano");
        zumbiAlvo.vida -= dano;
    }

    void fireBoll(Zumbi zumbiAlvo1,Zumbi zumbiAlvo2, float spellDamage){
        zumbiAlvo1.vida -= spellDamage;
        zumbiAlvo2.vida -= spellDamage;
    }

    void curar(){

    }



}
