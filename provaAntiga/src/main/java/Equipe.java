public class Equipe {
    String capitao;
    Heroi[]  herois = new Heroi[10];


    void adicionarHeroi(Heroi helo){
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] == null){
                herois[i] = helo;
                System.out.println("teste");
                break;
            }
        }
    }

    void mostraInfo(){
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] != null){
                System.out.println("Nome do capitao: "+capitao);
                System.out.println("Nome do heroi: "+ this.herois[i].nome);
                System.out.println("Poder do heroi: "+ this.herois[i].poder);
                if(this.herois[i].podeVoar == true) {
                    System.out.println("Esse heroi poder voar");
                }
            }

        }
    }

    void mostrarMaisForte(){
        String nomeDoPika = "teste";
        float maiorPoder = 0;
        for (Heroi heroi: herois){
            if(heroi != null){
                if(heroi.poder > maiorPoder){
                    nomeDoPika = heroi.nome;
                    maiorPoder = heroi.poder;
                }
            }

        }
        System.out.println("O maior poder encontrado foi de " + nomeDoPika + " com " + maiorPoder + " de poder");
    }

    void calcularVoadores(){
        float vunvun = 0f;
        float nop = 0f;
        for (Heroi heroi: herois){
            if(heroi != null){
                if(heroi.podeVoar == true)
                    vunvun +=1;
                else
                    nop +=1;
            }
        }
        System.out.println("A porcentagem de herois que pode voar é de " + (vunvun/(nop+vunvun))*100 +"%");
    }
}
