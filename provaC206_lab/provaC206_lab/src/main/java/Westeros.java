public class Westeros {
    Pessoa[] pessoas = new Pessoa[3];


    public void mostraInfo() {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                if (pessoas[i] instanceof Lorde) {
                    System.out.println("Lorde encontrado");
                    Lorde l = (Lorde) pessoas[i];
                    l.mostraInfo();
                    l.orar();
                    l.consagraCavaleiro();
                } else if (pessoas[i] instanceof Guarda) {
                    System.out.println("Guarda encontrado");
                    Guarda g = (Guarda) pessoas[i];
                    g.mostraInfo();
                    g.orar();
                    g.fazerPatrulha();
                } else if (pessoas[i] instanceof Cavaleiro) {
                    System.out.println("Cavaleiro encontrado");
                    Cavaleiro c = (Cavaleiro) pessoas[i];
                    c.mostraInfo();
                    c.orar();
                    c.consagraCavaleiro();
                    c.fazerPatrulha();
                }

            }
            System.out.println("--------------------");
        }
    }
}




