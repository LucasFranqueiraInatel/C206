public class Cachorro extends Mamifero {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Uau Uau");

    }

    public void mostraInfo(){
        System.out.println("Cachorro ");
        super.mostraInfo();

    }

}
