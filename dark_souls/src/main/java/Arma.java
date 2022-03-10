public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descrisao;

    void MostraInfoArma(){
        System.out.println("Nome da arma: "+this.nome);
        System.out.println("Poder da arma "+ this.poder);
        System.out.println("Resistencia da arma: "+this.resistencia);
        System.out.println("Descrisao da arma: "+ this.descrisao);
    }
}
