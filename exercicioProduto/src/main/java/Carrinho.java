public class Carrinho {
    double total;
    Produto[] produtos = new Produto[100];



    void exibirInfos(){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos != null){
                produtos[i].exibirInfos();
            }

        }
    }

    double calcularTotal(){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null){
                this.total = this.total + produtos[i].preco;
            }

        }
        return this.total;
    }

    void adicionarProduto(Produto produto){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] == null){
                produtos[i] = produto;
                System.out.println(produtos[i]);
                System.out.println("teste");
                break;

            }
        }

    }

    }


