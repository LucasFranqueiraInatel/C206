public class Carta {
    String nome;
    String tipo;
    double poder;
    Arma arma;

    Carta (){
        arma = new Arma();
    }


    void mostraInfo(){
        System.out.println("O poder da carta " + this.nome +" é de: " + poder);
        System.out.println("O tipo da carta "+ this.nome +" é tipo: " + this.tipo);
        System.out.println("A arma da carta "+ this.nome +" é tipo: "+ this.arma.tipo);
        System.out.println("*-*-*-*-*-*-*-*-1*-*-*-*-*-*-*-*");
    }
}
