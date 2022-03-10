import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Plataforma p = new Plataforma();
        boolean flag = true;


        while(flag){
            System.out.println("Entre com a opção desejada:" + "\n");
            System.out.println("1-Adicionar Serie: ");
            System.out.println("2-Mostrar informaçoes da plataforma e suas series: ");
            System.out.println("3-Mostrar o nome da série com maior número de temporadas que já foi " +
                    "finalizada");
            System.out.println("4-Mostrar a porcentagem do número de séries e a média aritmética de notas das que " +
                    "possuem 3 ou mais temporadas.");
            System.out.println("5-Sair");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    Serie s = new Serie();
                    p.addSerie(s);
                    break;

                case 2:
                    p.mostraInfo();
                    break;

                case 3:
                    System.out.printf("Serie com maior numero de temporadas finalizada: ");
                    System.out.printf(p.serieMaisLongaFinalizada());
                    System.out.printf("\n");
                    break;
                case 4:
                    p.mediaPorcentagem();
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }



    }
}
