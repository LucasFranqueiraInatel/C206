public class Main {
    public static void main(String[] args) {
        Ashen ash = new Ashen();
        Arma arma = new Arma();
        ash.arma = arma;
        ash.vida = 10;
        ash.nome = "Ash";
        arma.nome = "Stoker";
        arma.poder = 10;
        arma.descrisao = "Agulhada no olho";
        arma.resistencia = 20;

        ash.tomarDano();
        ash.usarArma();
        arma.MostraInfoArma();

    }
}
