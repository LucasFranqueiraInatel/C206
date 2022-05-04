public class Nave {
    private String nome;
    private  boolean velocidadeLuz;
    Personagem[] personagems = new Personagem[3];

    public Nave(String nome, boolean velocidadeLuz) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo() {
        System.out.println("Nome da nave: " +this.nome);
        if(velocidadeLuz == true) {
            System.out.println("Viaja na velocidade da luz");
        }else{
            System.out.println("Não viaja na velocidade da luz");
        }
        System.out.println("**************************************************");
        for (int i = 0; i < personagems.length; i++) {
            if (personagems[i] != null) {
                if (personagems[i] instanceof Jedi) {
                    System.out.println("Jedi encontrado");
                    Jedi j = (Jedi) personagems[i];
                    j.mostraInfo();
                    j.treinarPadawan();
                    j.travarBatalha();
                    j.usarForca();
                    j.trocarSabre("Verde");
                } else if (personagems[i] instanceof Sith) {
                    System.out.println("Sith encontrado");
                    Sith s = (Sith) personagems[i];
                    s.mostraInfo();
                    s.corromperJedi();
                    s.travarBatalha();
                    s.trocarSabre("Vermelho");
                    s.usarForca();
                } else if (personagems[i] instanceof Droid) {
                    System.out.println("Droid encontrado");
                    Droid d = (Droid) personagems[i];
                    d.mostraInfo();
                    d.hackerarSistema();
                    d.travarBatalha();

                }

            }
            System.out.println("--------------------");
        }
        System.out.println("Numero de personagem criados: " + Personagem.cont);
    }

}
