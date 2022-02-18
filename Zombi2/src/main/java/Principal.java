import java.util.Scanner;

public class Principal{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Jogador p1 = new Jogador();

        int acao;
        int kills = 0;

        z1.vida = 100;
        z2.vida = 200;
        z1.dano = 20;
        z2.dano = 12;

        System.out.println("Vida do zumbi z1: " + z1.vida);
        System.out.println("Vida do zumbi z2: " + z2.vida);

        p1.setAtack(z1, p1.dano);

        while (p1.vida > 0 || kills == 3 ){
            System.out.println("Escolha a sua acao :");
            System.out.println("Atacar = 1");
            System.out.println("FireBoll = 2");
            System.out.println("Correr = 3");
            acao = sc.nextInt();

            if(acao == 1){
                System.out.println("Escolha o seu alvo");
                if(z1.morto == false){

                }
                acao = sc.nextInt();

            }

        }

        /*
        if(z1.transfereVida(z2, 50)){
            System.out.println("Fazendo z1 transferir 50 para z2");
            System.out.println("Vida do zumbi z1: " + z1.vida);
            System.out.println("Vida do zumbi z2: " + z2.vida);
        }


        if(z1.transfereVida(z2, 150)){
            System.out.println("Fazendo z1 transferir 150 para z2");
            System.out.println("Vida do zumbi z1: " + z1.vida);
            System.out.println("Vida do zumbi z2: " + z2.vida);
        }else{
            System.out.println("A vida não foi alterada!!");
        }
        */

    }


}