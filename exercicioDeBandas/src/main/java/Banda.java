import lombok.Data;

import java.util.Scanner;

@Data
public class Banda {

    Scanner sc = new Scanner(System.in);

    Musica[] musicas = new Musica[10];
    Membro[] membros = new Membro[10];
    Empresario[] empresarios = new Empresario[10];

    private String nome;
    private String genero;

    public void mostraInfo(){
        System.out.println("Nome da banda: "+ this.nome);
        System.out.println("Genero da banda: "+ this.genero);
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println("Nome da musica: "+ musicas[i].getNome());
                System.out.println("Duracao da musica: "+ musicas[i].getDuracao());
            }
        }
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null){
                System.out.println("Nome do membro: " + membros[i].getNome());
                System.out.println("Funcao do membro: " + membros[i].getFuncao());
            }
        }
        for (int i = 0; i < empresarios.length; i++) {
            if(empresarios[i] != null){
                System.out.println("Nome do empresario: " + empresarios[i].getNome());
                System.out.println("CNPJ do empresario: " + empresarios[i].getCnpj());
            }

        }
    }

    public void addMusicaNova(Musica mus){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null){
                System.out.println("Digite o nome da musica:");
                mus.setNome(sc.nextLine());
                System.out.println("Digite a duracao da musica:");
                mus.setDuracao(sc.nextDouble());
                musicas[i] = mus;
                break;
            }
        }
    }

    public void addMembroNovo(Membro men){
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null){
                System.out.println("Digite o nome do novo membro:");
                men.setNome(sc.nextLine());
                System.out.println("Digite a funcao do " + men.getNome());
                men.setFuncao(sc.nextLine());
                membros[i] = men;
                break;
            }
        }
    }

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }
}
