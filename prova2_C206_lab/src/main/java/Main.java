public class Main {
    public static void main(String[] args) {

        Sabre sabreJedi = new Sabre("Azul");
        Sabre sabreSith = new Sabre("Preto");
        Jedi j = new Jedi("Lucas", 70,false,sabreJedi);
        Sith s = new Sith("Gege", 60,true,sabreSith);
        Droid d = new Droid("Droid", 10, false);
        Nave nave = new Nave("Nave", true);

       nave.personagems[0] = j;
       nave.personagems[1] = s;
       nave.personagems[2] = d;

       nave.mostraInfo();


    }
}
