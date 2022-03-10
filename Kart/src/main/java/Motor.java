import lombok.Data;

@Data
public class Motor {

    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo(){
        System.out.println("Cilindradras: "+getCilindradas());
        System.out.println("Velocidade: "+ getVelocidadeMaxima());

    }


}
