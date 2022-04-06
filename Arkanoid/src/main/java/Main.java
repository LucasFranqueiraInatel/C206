import lombok.Data;

@Data
public class Main {

    public static void main(String[] args) {
        Jogador j = new Jogador();
        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        Bloco b3 = new Bloco();

        j.destruirBloco();
        j.mostraInfo();
        Conversor.convs(j);

    }
}
