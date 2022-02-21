public class Zumbi {

    //Mémbros da classe
    String nome;
    double vida;
    boolean morto = false;
    float dano;


    void atacar (){
        System.out.println(
                "Zumbi " + nome + " atacou voce.");
    }

    void tacarPedra(){
        System.out.println("Zumbi tacou uma pedra");
    }

    void gritar(){
        System.out.println("arararaararararara");
    }

    void andar(){
        System.out.println("devagar e sempre");
    }

    void info() {
        if (morto == false){
            System.out.println(nome);
            System.out.println(vida);
            System.out.println(dano);
        }
        else{
            System.out.println("O Zumbi " + nome +" ja esta morto");
        }

    }
}