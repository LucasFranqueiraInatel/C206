import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Robo r1 = new Robo("C3P8");
        Robo r2 = new Robo("R2D2");
        Robo r3 = new Robo("BBB");

        System.out.println("Numero de robos criados: "+Robo.cont);
        r1.mostraInfo();
        r2.mostraInfo();
        r3.mostraInfo();

        Robo.mostraMensagem();
        JOptionPane.showMessageDialog(null, "Hello World");
        int n1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de n1"));
        JOptionPane.showMessageDialog(null,"Valor de n1: " + n1);


    }
}
