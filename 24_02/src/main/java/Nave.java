public class Nave {

    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    //Arma arma = new Arma(); // composicao
    Arma arma; //Agregação

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
        this.arma = arma;
    }

    void addArma(Arma arma){
        this.arma = arma;
    }

    void mostraInfo(){
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade " + this.velocidade);
        System.out.println("velocidade da luz " + this.velocidadeDaLuz);
        if(this.arma != null){
            System.out.println("Tipo da arma " + this.arma.tipo);
            System.out.println("Dano da arma " + this.arma.poder);
        }
        else
            System.out.println("A nave nao possui arma ");
    }



}
