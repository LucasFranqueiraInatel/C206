import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Livro[] estante = new Livro[5];

        for (int i = 0; i < estante.length; i++) {
            estante[i] = new Livro();

        }



        //Criando um livro e pondo na estante
        Livro l1 = new Livro();
        l1.nome = "O nome do vento";
        l1.qtdPaginas = 600;
        estante[0] = l1;

        //Instanciar o livro direto no array

        for (int i = 0;i < estante.length; i++){
            System.out.println(estante[i]);
        }

        estante[1] = new Livro();
        estante[1].nome = "O temor do sábio";
        estante[1].qtdPaginas = 920;

        for (int i = 0;i < estante.length; i++){
            if(estante[i] != null)
                estante[i].mostraInfo();
        }
         */

        Biblioteca b = new Biblioteca();
        b.nome = "biblioteca Municipal";

        boolean flag = true;

        while (flag){
            System.out.println("Opcoes disponiveis: ");
            System.out.println("1 - Cadastrar outro livro ");
            System.out.println("2 - Mostrar informacoes ");
            System.out.println("3 - Sair");
            System.out.println("Sua opcao: ");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    sc.nextLine();
                    Livro l = new Livro();
                    System.out.println("Digite o nome do livro: ");
                    l.nome = sc.nextLine();
                    System.out.println("Digite quantas paginas tem o livro: ");
                    l.qtdPaginas = sc.nextInt();
                    b.cadastrarLivro(l);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    b.mostraInfo();
                    break;
                case 3:
                    System.out.println("Voce saiu");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;

            }
        }

    }
}
