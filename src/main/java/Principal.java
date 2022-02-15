public class Principal {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Zumbi z3 = new Zumbi();

        z1.nome = "Robison";
        z2.nome = "Volatil";
        z3.nome = "Ironia";

        z1.fome = true;

        z1.atacar();
        z2.atacar();
        z3.atacar();

    }


}