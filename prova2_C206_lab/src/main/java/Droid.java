import lombok.Data;

@Data
public class Droid extends Personagem {

    private boolean hostil;

    public Droid(String nome, int poder, boolean hostil) {
        super(nome, poder);
        this.hostil = hostil;
    }

    public void hackerarSistema(){
        System.out.println(getNome() + " hackeou o sistema da nave");
    }

    @Override
    public void travarBatalha(){
        if (hostil == true){
            System.out.println(getNome() + " travou uma batalha contra o jedi");
        }
        else
            System.out.println(getNome() + " travou uma batalha contra um sith");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        if(hostil == true)
            System.out.println(getNome() + " é hostil");
        else
            System.out.println(getNome() + " não é hostil");

    }


}
