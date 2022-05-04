public class Main {
    public static void main(String[] args) {

        Westeros westeros = new Westeros();
        Arma basta = new Arma("Porrete", 100);
        Montaria m = new Montaria("Pocoto");
        Cavaleiro c = new Cavaleiro("Jorge", 5, basta,"Ronalds", m );
        Lorde l = new Lorde("Lorenzo", 5, basta, "Pidronho",24);
        Guarda g = new Guarda("Fernando", 5, basta, 7,m);

        westeros.pessoas[0] = c;
        westeros.pessoas[1] = l;
        westeros.pessoas[2] = g;

       westeros.mostraInfo();
        System.out.println("Teste para ver as mudancas: ");
       System.out.println("*********************************************");
       westeros.mostraInfo();

        }

        }




