public class Ingresso {
    private double valorBase;
    private String nomeFilme;
    private boolean dublado;

    public Ingresso(double valorBase, String nomeFilme, boolean dublado) {
        this.valorBase = valorBase;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }
    public double calcularValor() {
        return this.valorBase;
    }

    public double getValorBase() {
        return valorBase;
    }


    public String getNomeFilme() {
        return nomeFilme;
    }



    public boolean isDublado() {
        return dublado;
    }
}
