public abstract class Pessoa {
    public static int cont = 0;
    private String nome;
    private int honra;
    private int id;
    private Arma arma;

    public Pessoa(String nome, int honra, Arma arma) {
        this.nome = nome;
        this.honra = honra;
        cont++;
        this.id = cont;
        this.arma = arma;
    }

    public Pessoa() {

    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Honra: " + this.getHonra());
        System.out.println("Id: " + this.getId());
        System.out.println("Tipo da arma: " + arma.getTipo());
        System.out.println("Poder da arma: " + arma.getPoder());
    }

    public void orar(){
        System.out.println();

    }







    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Pessoa.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHonra() {
        return honra;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}


