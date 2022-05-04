public class Boi extends Mamifero{

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    public void mostraInfo(){
        System.out.println("Boi ");
        super.mostraInfo();

    }

    @Override
    public void emitirSom(){
        System.out.println("Corrrrnooooo");

    }

}
