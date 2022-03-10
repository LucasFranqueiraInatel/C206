public class Serie {
    String nome;
    double nota;
    int temporadas;
    boolean finalizado;
    Diretor diretor;

    public Serie() {
        diretor = new Diretor();
    }

    void mostrarInfo() {
        System.out.println("Nome da serie: " + this.nome);
        System.out.println("Nome do diretor: " + this.diretor.nome);
        System.out.println("Nota da serie: " + this.nota);
        System.out.println("Nº de temporadas: " + this.temporadas);
        System.out.println("A serie já acabou ? " + this.finalizado);
    }
}
