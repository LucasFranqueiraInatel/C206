import java.util.Scanner;

public class Deck {
    String dono;
    Carta[] cartas = new Carta[10];

    Scanner sc = new Scanner(System.in);

    void mostraInfo(){
        for (Carta carta: cartas){
            if (carta != null){
                carta.mostraInfo();
            }
        }
    }

    void addCarta(Carta c){
        for (int i = 0; i <this.cartas.length; i++) {
            if(cartas[i] == null){
                System.out.println("Digite o nome da carta: ");
                c.nome = sc.nextLine();
                System.out.println("Digite o tipo da carta: ");
                c.tipo = sc.nextLine();
                System.out.println("Digite o poder da carta: ");
                c.poder = sc.nextDouble();
                System.out.println("Digite o tipo de arma da carta: ");
                sc.nextLine();
                c.arma.tipo = sc.nextLine();
                cartas[i] = c;
                break;
            }
        }
    }

    String maiorQuantidade(){
        int soldado = 0;
        int arqueiro = 0;
        int pesado = 0;
        String auxArqueiro = "arqueiro";
        String auxSoldado = "soldado";
        String auxPesado = "pesado";
        String aux = "aux";
        for(int i = 0; i <this.cartas.length; i++){
            if(cartas[i] != null){
                if(cartas[i].tipo.equals(auxArqueiro)){
                    arqueiro += 1;
                }
                else if(cartas[i].tipo.equals(auxSoldado)){
                    soldado += 1;
                }
                else if (cartas[i].tipo.equals(auxPesado)){
                    pesado += 1;
                }
            }

        }

        if (arqueiro > soldado && arqueiro > pesado){
            aux = "arqueiro";
        }
        else if (soldado > arqueiro && soldado > pesado){
            aux = "soldado";

        }
        else if (pesado > arqueiro && pesado > soldado){
            aux = "pesado";

        }
        else{
            aux = "Deu empate";
        }
        return aux;
    }

    void mediaTipos(){
        int total = 0;
        double somaPoder = 0;
        for(Carta carta: cartas){
            if(carta != null){
                total++;
                somaPoder += carta.poder;
            }
        }
        System.out.println("A media aritmetica de poder das cartas do deck: "+ (somaPoder/total));
    }
}

