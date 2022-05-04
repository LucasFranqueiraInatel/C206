import lombok.Data;

@Data
public abstract class Personagem {

    public static int cont = 0;
    private String nome;
    private int id;
    private int poder;

    public Personagem(String nome, int poder) {
        cont++;
        this.nome = nome;
        this.id = cont;
        this.poder = poder;

    }

    public void mostraInfo(){
        System.out.println("Nome: "+ getNome());
        System.out.println(getNome() + " id: " + getId());
        System.out.println("Poder: " + getPoder());

    }

    public void travarBatalha(){

    }

}
