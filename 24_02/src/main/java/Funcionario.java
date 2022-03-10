public class Funcionario {


    String nome;
    int idade;
    int cpf;
    double salario;

    Funcionario (String nome, int idade, int cpf, double salario){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        System.out.println("Um funcionario foi criado");
    }

    Funcionario(){

    }

    //acoes
    void tirarFerias(){
        System.out.println("Tirou ferias");
    }

    void mostraInfo(){
        System.out.println("Nome "+ this.nome);
        System.out.println("Salario "+ this.idade);
        System.out.println("Idade "+ this.cpf);
        System.out.println("Salario "+ this.salario);

    }

    double calculaSalarioAnual(){
        double salarioAnual;
        salarioAnual = this.salario * 12;
        return salarioAnual;
    }
}


