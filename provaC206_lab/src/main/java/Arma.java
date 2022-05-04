public class Arma {
    private String tipo;
    private int poder;

    public Arma(String tipo, int poder) {
        this.tipo = tipo;
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
