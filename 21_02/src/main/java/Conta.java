public class Conta {


    String nomeDoDono;
    int numero;
    float saldo;
    float limite;



    void sacar(float quantia) {
        saldo -= quantia;
    }


    void deposita(float quantia) {
        saldo += quantia;
    }


    void transferir(Conta contaDestino, float quantia) {
        saldo -= quantia;
        contaDestino.deposita(quantia);
    }

}