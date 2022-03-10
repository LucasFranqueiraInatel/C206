public class Conta {



    private double saldo,limite,tes;
    int tete;
    String nomeDoDono;
    Cliente cliente;

    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(){

    }

    void depositar(double quantia){
        saldo += quantia;
    }

    void sacar(double quantia){
        saldo -= quantia;
    }

    //getter e setters

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}





