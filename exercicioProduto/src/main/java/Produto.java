public class Produto {
    String nome;
    String descricao;
    String fabricante;
    double preco;

    void exibirInfos(){
        System.out.println("Nome do produto: "+ this.nome);
        System.out.println("Descricao do produto: "+ this.descricao);
        System.out.println("Fabricante do produto: "+this.descricao);
        System.out.println("Preco do produto: "+ this.preco);
    }


}
