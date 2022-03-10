import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Equipe e = new Equipe();
        boolean flag = true;
        System.out.println("Digite o nome do capitao da sua equipe");
        e.capitao = sc.nextLine();
        while (flag){
            System.out.println("Opcoes disponiveis: ");
            System.out.println("1 - Adicionar heroi");
            System.out.println("2 - Mostrar informacoes dos herois");
            System.out.println("3 - Mostrar quem tem maior poder");
            System.out.println("4 - Mostrar a porcentagem de herois que podem voar");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    Heroi h = new Heroi();
                    System.out.println("Digite o nome do heroi: ");
                    h.nome = sc.nextLine();

                    System.out.println("Poder do heroi");
                    h.poder = sc.nextFloat();
                    sc.nextLine();

                    System.out.println("Ele pode voar ou nao: ");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Nao");
                    int aux;
                    aux = sc.nextInt();
                    switch (aux){
                        case 1:
                            h.podeVoar = true;
                            break;
                        case 2:
                            h.podeVoar = false;
                            break;
                        default:
                            System.out.println("vai se fuder");
                            h.podeVoar = false;
                            break;
                    }
                    e.adicionarHeroi(h);
                    break;
                case 2:
                    System.out.println("Nome do capitao: "+ e.capitao);
                    e.mostraInfo();
                    break;
                case 3:
                    e.mostrarMaisForte();
                    break;
                case 4:
                    e.calcularVoadores();
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
