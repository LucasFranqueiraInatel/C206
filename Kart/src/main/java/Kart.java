import lombok.Data;

@Data
public class Kart {
    private String nome;
    Piloto piloto;
    Motor motor;


    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulando");

    }

    void soltarTurbo(){
        System.out.println("Turbo acionado");

    }

    void fazerDrift(){
        System.out.println("Aciondando turbo");

    }
}
