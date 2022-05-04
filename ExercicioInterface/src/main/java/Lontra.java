public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Lontra ta rugindooo");
    }


    public void nadar(){
        System.out.println("To nadando gaizs");
    }


    public void mostraInfo(){
        System.out.println("Lontra ");
        super.mostraInfo();

    }
}
