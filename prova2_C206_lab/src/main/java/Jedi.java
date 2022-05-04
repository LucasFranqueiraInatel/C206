import lombok.Data;

@Data
public class Jedi extends Personagem implements Treinamento, Forca{

    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int poder, boolean mestre, Sabre sabre) {
        super(nome, poder);
        this.mestre = mestre;
        this.sabre = sabre;
    }


    public void treinarPadawan(){
        if (mestre == true || getPoder() > 70)
            System.out.println(getNome() + " treinou um Padawan");
        else
            System.out.println(getNome() + " ainda nao consegue treinar padawans");
    }

    public void trocarSabre(String cor){
        this.sabre.setCor(cor);
    }

    public void usarForca(){
        System.out.println(getNome() + " usou a forca para o bem");
        setPoder(getPoder() + 5);
    }

    @Override
    public void travarBatalha(){
        System.out.println(getNome() + " travou uma batalha contra um sith");
        setPoder(getPoder() + 1);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(mestre == true)
            System.out.println(getNome() + " é um mestre");
        else
            System.out.println(getNome() + " não é um mestre");
        System.out.println("Cor do sabre: " + sabre.getCor());
    }

}
