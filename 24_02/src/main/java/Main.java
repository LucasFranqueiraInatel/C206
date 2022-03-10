import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nave n1 = new Nave("voias",200, true);
        //n1.arma.tipo = "Canhao de aneis";
        //n1.arma.poder = 800;
        Arma arma = new Arma();
        arma.tipo = "Canhao";
        arma.poder = 500;
        n1.addArma(arma);
        n1.mostraInfo();




        /*
        Funcionario func1 = new Funcionario();

        func1.nome = "Elden Ring";
        func1.cpf = 1;
        func1.idade = 12;
        func1.salario = 3000;

        Funcionario func2 = new Funcionario("Gabriel",30,151, 3000);

        func1.mostraInfo();



        double Salario = func1.calculaSalarioAnual();
        System.out.println("Salario anual"+ Salario);
        */



    }
}
