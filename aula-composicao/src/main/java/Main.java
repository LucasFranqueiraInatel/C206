import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner((System.in));
        Conta c = new Conta();
        c.saldo = 1000;
        c.limite = 10;
        Cliente cliente = new Cliente();
        c.cliente = cliente;
        c.cliente.cpf = "141";
        c.cliente.idade = 11;
        c.cliente.endereco = "beco";

        System.out.println(cliente.idade);
        System.out.println(c.cliente.idade);

         */

        Pessoa p = new Pessoa();
        p.setNome("Capirota");
        System.out.println(p.getNome());
        p.setCpf("11");
        System.out.println(p.getCpf());


    }
}
