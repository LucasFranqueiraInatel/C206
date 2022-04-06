public class Engenheiro extends  Funcionario implements GerenciaProjeto,Atividade {

    public String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    public double salarioAnual(){
        return this.getSalario() * 12;
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " esta fazendo um projeto");
    }


    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " esta gerenciando");
    }

    @Override
    public void finalizaProjeto() {
        System.out.println("Finalizou o projeto");
    }

    @Override
    public void fazAtividade() {
        System.out.println(this.getNome() + " faz atividade fisica 4 vezes por semana ");
    }
}
