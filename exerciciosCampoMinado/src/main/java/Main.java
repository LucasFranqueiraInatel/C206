import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bomba b = new Bomba();
        Random random = new Random();
        int [][] campo = new int [2][2];
        int contador = 0;
        int x;
        int y;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                campo[i][j] = 0;
            }
        }

        int Bombax = random.nextInt(2);
        int BombaY = random.nextInt(2);
        campo [Bombax][BombaY] = 1;

        while (contador < 3){
            x = sc.nextInt();
            y = sc.nextInt();

            if(campo[x][y] == 1){
                Bomba.explodir();
                contador = 0;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        campo[i][j] = 0;
                    }
                }
                campo [Bombax][BombaY] = 1;

            }
            else if(campo[x][y] == 0){
                System.out.println("ACERTOU");
                contador++;
                campo[x][y] = 2;
            }
            else{
                System.out.println("Opa Opa, calma lá rapaz");
            }
        }
        System.out.println("Voce ganhou meu parsa");

    }
}
