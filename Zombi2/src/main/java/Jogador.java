public class Jogador {

    float vida = 100f;
    float mp = 100f;
    boolean morto = false;
<<<<<<< HEAD
    float dano = 25f;
    float spellDamage = 11.5f;
=======
    float dano = 25;
    float spealDamage = 11.5f;
>>>>>>> 2b1ab5586abb127df877da820c0e9c5595ca09b4

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
