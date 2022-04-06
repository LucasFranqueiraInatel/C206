import lombok.Data;

@Data
public class Main {
    public static void main(String[] args) {
        Banda b = new Banda("os loucos","rock");
        Membro m = new Membro();
        Musica mus = new Musica();
        Empresario em = new Empresario("Jorge" , 245);
        b.addMembroNovo(m);
        b.addMusicaNova(mus);
        b.mostraInfo();

    }



}
