public class Biblioteca {
    String nome;
    Livro[] livros = new Livro[100];

    void mostraInfo(){
        System.out.println("Nome da biblioteca: "+ this.nome);
        System.out.println("**Livros disponiveis: ");
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null)
                livros[i].mostraInfo();

        }
        }

        void cadastrarLivro(Livro livro){
            for (int i = 0; i < this.livros.length; i++) {
                if(livros[i] == null){
                    livros[i] = livro;
                    break;
                }

            }
        }
    }

