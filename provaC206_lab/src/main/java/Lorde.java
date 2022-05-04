public class Lorde extends Pessoa implements Consagra {
    private String casa;
    private int qtdVassalos;

    public Lorde(String nome, int honra, Arma arma, String casa, int qtdVassalos) {
        super(nome, honra, arma);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }

    public void consagraCavaleiro(){
        System.out.println(getNome() + " consagrou um novo cavaleiro");
        qtdVassalos++;
    }

    @Override
    public void orar(){
        System.out.println(getNome() + " fez uma oração aos sete deuses" );
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Casa: " + this.getCasa());
        System.out.println("Quantidade de vassalos: "+ this.getQtdVassalos());
    }






    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getQtdVassalos() {
        return qtdVassalos;
    }

    public void setQtdVassalos(int qtdVassalos) {
        this.qtdVassalos = qtdVassalos;
    }
}
