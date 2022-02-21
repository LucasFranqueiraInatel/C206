import java.util.Scanner;

public class Principal{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Jogador p1 = new Jogador();
        
        int alvo = 0;
        int acao = 0;
        int kills = 0;

        z1.vida = 100;
        z2.vida = 200;
        z1.dano = 20;
        z2.dano = 12;


        //System.out.println("Vida do zumbi z1: " + z1.vida);
        //System.out.println("Vida do zumbi z2: " + z2.vida);
        //p1.setAtack(z1, p1.dano);


        while (p1.vida > 0 || kills == 2 ){
            System.out.println("Escolha a sua acao :");
            System.out.println("Atacar = 1");
            System.out.println("FireBoll = 2");
            System.out.println("Correr = 3");
            acao = sc.nextInt();

            System.out.println(acao);
            if(acao == 1){
<<<<<<< HEAD
                System.out.println("Selecione o seu alvo");
                z1.info();
                z2.info();
                alvo = sc.nextInt();
=======
                System.out.println("Escolha o seu alvo");
                if(z1.morto == false){

                }
                acao = sc.nextInt();
>>>>>>> 2b1ab5586abb127df877da820c0e9c5595ca09b4

                p1.setAtack();
            }

        }


    }


}