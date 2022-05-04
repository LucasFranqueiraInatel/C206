public class Guarda extends Pessoa implements Patrulha{

    private int corgem;
    private Montaria montaria;

    public Guarda(String nome, int honra, Arma arma, int corgem, Montaria montaria) {
        super(nome, honra, arma);
        this.corgem = corgem;
        this.montaria = montaria;
    }

    @Override
    public void fazerPatrulha(){
        System.out.println(getNome() + "fez uma patrulha além da muralha ");
        corgem = corgem + 20;
    }


    @Override
    public void orar(){
        System.out.println(getNome() + " fez uma oração aos deuses antigos" );
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Corgem: " + this.getCorgem());
        System.out.println("Montaria: " + montaria.getNome());
    }

    public int getCorgem() {
        return corgem;
    }

    public void setCorgem(int corgem) {
        this.corgem = corgem;
    }

    public Montaria getMontaria() {
        return montaria;
    }

    public void setMontaria(Montaria montaria) {
        this.montaria = montaria;
    }
}
