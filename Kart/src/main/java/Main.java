public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.setNome("Karti1");
        kart2.setNome("Karti2");

        kart1.motor.setCilindradas("150");
        kart1.motor.setVelocidadeMaxima(95.20f);

        kart2.motor.setCilindradas("100");
        kart2.motor.setVelocidadeMaxima(76.20f);


        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.setNome("teste");
        System.out.println(piloto1.getNome());
        piloto1.setVilao(false);
        System.out.println(piloto1.vilao);




    }
}
