import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float altura;
        float peso;
        System.out.println("Entre com o seu peso");
        peso = sc.nextFloat();
        System.out.println("Entre com a sua altura");
        altura = sc.nextFloat();
        float mc = peso/(altura*altura);
        if(mc < 18.5){
            System.out.println("abaixo do peso");
        }
        else if (mc >= 18.6 && mc <=24.9){
            System.out.println("Peso ideal");
        }
        else if(mc >=25 && mc <=29.9)
            System.out.println("levemente acima do peso");
        else if(mc >= 30 && mc <= 34.9)
            System.out.println("obesidade 1");
        else if(mc >= 35 && mc <= 39.9)
            System.out.println("obesidade 2");
        else
            System.out.println("fudido");
    }

}
