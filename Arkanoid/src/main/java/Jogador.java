import lombok.Data;

@Data
public class Jogador {

    private int pontos;

    public void destruirBloco() {
        Bloco.nBloco--;
        Bloco.diedBloco++;
        pontos++;
    }

    public void mostraInfo() {
        System.out.println("Bloco criados: " + Bloco.nBloco);
        System.out.println("Bloco destruidos: " + Bloco.diedBloco);
    }
}


