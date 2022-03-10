public class Ashen {
    String nome;
    int vida;
    Arma arma;



    void usarArma(){
        this.arma.resistencia -=2;
        System.out.println("Resistencia da arma: "+this.arma.resistencia);
    }

    void tomarDano(){
        this.vida -=5;
        System.out.println("Vida da Ash: "+ this.vida);
    }
}
