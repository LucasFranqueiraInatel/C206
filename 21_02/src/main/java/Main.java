import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantia;

        Conta c1 = new Conta();
        c1.saldo = 50;
        Conta c2 = new Conta();
        c2.saldo = 100;

        System.out.println("Saldo C1:" + c1.saldo);
        System.out.println("Saldo C2:" + c2.saldo);

        c2.transferir(c1,20);
        System.out.println("Saldo C1:" + c1.saldo);
        System.out.println("Saldo C2:" + c2.saldo);

        c2.sacar(10);
        System.out.println("Saldo C1:" + c1.saldo);
        System.out.println("Saldo C2:" + c2.saldo);
    }

}
