import lombok.Data;

@Data
public class Sith extends Personagem implements Forca {

    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int poder, boolean darth, Sabre sabre) {
        super(nome, poder);
        this.darth = darth;
        this.sabre = sabre;
    }

    public void corromperJedi(){
        if (darth == true && getPoder() > 60){
            System.out.println(getNome() + " levou um jedi para o lado negro da forca");
        }
        else
            System.out.println(getNome() + " ainda não consegue corromper jedis");

    }

    public void usarForca(){
        System.out.println(getNome() + " usou o ladro negro da forca");
        setPoder(getPoder() + 3);
    }

    public void trocarSabre(String cor){
        this.sabre.setCor(cor);
    }

    @Override
    public void travarBatalha(){
        System.out.println(getNome() + " travou uma batalha contra o jedi");
        setPoder(getPoder() + 1);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(darth == true)
            System.out.println(getNome() + " é um darth");
        else
            System.out.println(getNome() + " não é um darth");
        System.out.println("Cor do sabre: " + sabre.getCor());
    }

}
