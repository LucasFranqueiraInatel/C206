public abstract class Mamifero implements Comparable<Mamifero> {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();


    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: "+ this.vida);
    }

    @Override
    public int compareTo(Mamifero o) {
        if(this.vida < o.vida){
            return 1;
        }
        else if(this.vida > o.vida){
            return -1;
        }
        else{
            return 0;
        }
    }
}
