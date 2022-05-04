import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*

        Arquivo a = new Arquivo();
        Funcionario ff = new Funcionario("jao",20,"600");
        a.escrever(ff);


         */
        ///////////////////////////////////////////////////////////////////////////////////////
        /*
        ArrayList<Funcionario> funcs = a.ler();

        for(Funcionario func: funcs){
            System.out.println("Nome: " + func.nome);
            System.out.println("Idade: " + func.idade);
            System.out.println("CPF: " + func.cpf);
        }

         */
        ///////////////////////////////////////////////////////////////////////////////////////
        boolean flag = true;
        while (flag){
            System.out.println("1 - Adicionar funcionario");
            System.out.println("2 - Mostrar funcionarios");
            System.out.println("3 - Sair");
            System.out.println("Sua opcao: ");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    Funcionario f = new Funcionario();
                    System.out.println("Digite o nome do funcionario: ");
                    f.nome = sc.nextLine();
                    System.out.println("Digite a idade: ");
                    f.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o CPF: ");
                    f.cpf = sc.nextLine();
                    Arquivo.escrever(f);
                    break;
                case 2:
                    ArrayList<Funcionario> funcs = Arquivo.ler();
                    for(Funcionario funcionario : funcs){
                        System.out.println("Nome: " + funcionario.nome);
                        System.out.println("Idade: " + funcionario.idade);
                        System.out.println("CPF: " + funcionario.cpf);
                    }
                    break;
                case 3:
                    System.out.println("Voce Saiu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao invalidade");
                    break;

            }

        }


    }
}