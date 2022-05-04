public class Cavaleiro extends Pessoa implements Consagra, Patrulha {

    private String casa;
    private Montaria montaria;

    public Cavaleiro(String nome, int honra, Arma arma, String casa, Montaria montaria) {
        super(nome, honra, arma);
        this.setCasa(casa);
        this.montaria = montaria;
    }

    public void consagraCavaleiro(){
        System.out.println(getNome() + " consagrou um novo cavaleiro");
        setHonra(getHonra() + 5);
    }

    @Override
    public void fazerPatrulha(){
        System.out.println(getNome() + "fez patrulha pelo reino ");
    }

    @Override
    public void orar(){
        System.out.println(getNome() + " fez uma oração o deus do fogo" );
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Casa: " + this.getCasa());
        System.out.println("Montaria: " + montaria.getNome());
    }


    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public Montaria getMontaria() {
        return montaria;
    }

    public void setMontaria(Montaria montaria) {
        this.montaria = montaria;
    }
}
