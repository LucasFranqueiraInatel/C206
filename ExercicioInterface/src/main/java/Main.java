import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cachorro c = new Cachorro("Cao",20);
        Boi b = new Boi("Chifrudo",-9);
        Lontra l = new Lontra("Jerso",95);

        List<Mamifero> listaDeMamiferos = new ArrayList<Mamifero>();
        listaDeMamiferos.add(c);
        listaDeMamiferos.add(b);
        listaDeMamiferos.add(l);


        Collections.sort(listaDeMamiferos);


        for (Mamifero tipo : listaDeMamiferos){
            System.out.println(tipo.nome);
            System.out.println(tipo.vida);
        }























        // Exercicio de interfase
        /*
        l.mostraInfo();
        l.emitirSom();
        l.nadar();
        System.out.println("////////////////////////");
        c.mostraInfo();
        c.emitirSom();
        System.out.println("////////////////////////");
        b.mostraInfo();
        b.emitirSom();
        System.out.println("////////////////////////");

         */

    }


}
