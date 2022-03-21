import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        boolean flag =true;
        Scanner sc = new Scanner(System.in);

        while(flag) {
            System.out.println("Entre com a opção desejada:" + "\n");
            System.out.println("1-Adicionar carta no deck: ");
            System.out.println("2-Mostrar informacoes do deck e suas cartas: ");
            System.out.println("3-Mostrar o tipo em maior quantidade no deck: ");
            System.out.println("4-Mostrar a media aritmetica de poder de cada tipo: ");
            System.out.println("5-Sair");
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    Carta carta = new Carta();
                    d.addCarta(carta);
                    break;
                case 2:
                    System.out.println("Mostrando informacoes do deck de Gabriel Pivoto");
                    d.mostraInfo();
                    break;
                case 3:
                    System.out.println("O maior tipo de carta encontrada no deck: ");
                    System.out.println(d.maiorQuantidade());
                    break;
                case 4:
                    d.mediaTipos();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }
    }
}
