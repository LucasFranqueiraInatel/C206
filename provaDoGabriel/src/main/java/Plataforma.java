import java.util.Scanner;

public class Plataforma {
    String nome;
    Serie[] series = new Serie[100];
    Scanner sc = new Scanner(System.in);
    void mostraInfo(){
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null){
                series[i].mostrarInfo();

            }

        }
    }

    void addSerie(Serie serie){
        for (int i = 0; i < this.series.length; i++) {
            if(series[i] == null){
                System.out.println("Digite o nome da serie");
                serie.nome = sc.nextLine();
                System.out.println("Digite o nome do Diretor");
                serie.diretor.nome = sc.nextLine();
                System.out.println("Digite a nota da serie: ");
                serie.nota = sc.nextDouble();
                System.out.println("Entre com o numero de temporadas: ");
                serie.temporadas = sc.nextInt();
                System.out.println("Digite se ela está finalizada: ");
                System.out.println("True para sim e False para não: ");
                serie.finalizado = sc.nextBoolean();
                sc.nextLine();
                series[i] = serie;
                break;
            }
        }
    }

    String serieMaisLongaFinalizada(){
        int aux = 0;
        String novoNome = "Nada";
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null){
                if (series[i].finalizado == true){
                    if (series[i].temporadas>aux){
                        aux = series[i].temporadas;
                        novoNome = series[i].nome;

                    }
                }
            }

        }
        if(aux == 0)
            novoNome = "Nenhuma serie finalizada";


        return novoNome;
    }

    void mediaPorcentagem(){
        double aux = 0;
        double notas=0;
        double contador = 0;
        double totalDeSeries=0;
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null){
                totalDeSeries++;
                if (series[i].temporadas>=3){
                    contador++;
                    notas += series[i].nota;

                }

            }

        }
        aux = (contador/totalDeSeries)*100 ;
        System.out.println("A taxa de series com mais de 3 temporadas é de " + aux + "%"+"\n" );
        System.out.println("A media aritimetica das notas das series que tem mais de 3 temporadas: " + (notas/contador) );

    }





}
