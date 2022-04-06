import lombok.Data;

@Data
public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void mostrainfo(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Salario: "+ this.salario);

    }

    public double salarioBonus(){
        return this.salario;
    }

    public abstract void fazAlgo();





}
