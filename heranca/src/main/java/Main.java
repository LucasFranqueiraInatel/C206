public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];

        Professor p = new Professor("Chris", 27, 15000, "POO");
        Engenheiro e = new Engenheiro("Tonho", 46, 5600, "SoftWare");
        Arquiteto a = new Arquiteto("Fabiola", 34, 45000);
        Funcionario func;

        funcionarios[0] = e;
        funcionarios[1] = p;
        funcionarios[2] = a;

        Professor prof; //permite usar

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null){
                if (funcionarios[i] instanceof Professor){
                    System.out.println("Esta posicao tem um professor");
                    prof = (Professor) funcionarios[i];
                    prof.mostrainfo();
                    prof.fazAlgo();
                    prof.corrigeProvas();
                }else if (funcionarios[i] instanceof  Engenheiro){
                    System.out.println("Esta posicao tem um Engenheiro");
                    Engenheiro eng = (Engenheiro) funcionarios[i];
                    eng.mostrainfo();
                    eng.salarioAnual();
                    eng.fazAlgo();
                    System.out.println(" ");
                }

            }

        }














//        e.fazAlgo();
//        System.out.println("  ");
//        p.mostrainfo();
//        p.fazAlgo();
//        System.out.println("Salario do professor com bonus: "+ p.salarioBonus());

    }

}
