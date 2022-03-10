import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();


        boolean flag = true;
        while (flag){
            System.out.println("Digita a sua opcao: ");
            System.out.println("1 - Adicionar produto: ");
            System.out.println("2 - Exibir preco total: ");
            System.out.println("3 - Sair");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    Produto p = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    p.nome = sc.nextLine();

                    System.out.println("Digite sua descricao: ");
                    p.descricao = sc.nextLine();

                    System.out.println("digite a fabricante: ");
                    p.fabricante = sc.nextLine();

                    System.out.println("Digite seu preco");
                    p.preco = sc.nextDouble();

                    carrinho.adicionarProduto(p);
                    break;
                case 2:
                    System.out.println("O preco total foi: "+carrinho.calcularTotal());
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Essa nao vai rolar");
                    break;

            }
        }

    }
}
