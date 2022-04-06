public class Professor extends Funcionario implements Atividade{

    public String materia;

    public Professor(String nome, int idade, double salario, String materia){
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigeProvas(){
        System.out.println(this.getNome() + " esta corrigindo prova");
    }


    @Override
    public void mostrainfo(){
        super.mostrainfo();
        System.out.println("Materia: "+ this.materia);
    }
    @Override
    public double salarioBonus(){
        return super.salarioBonus() + 300;
    }
    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " esta dando aula de " + this.materia);
    }

    @Override
    public void fazAtividade() {
        System.out.println(this.getNome() + " faz atividade fisica 4 vezes por semana ");
    }
}
