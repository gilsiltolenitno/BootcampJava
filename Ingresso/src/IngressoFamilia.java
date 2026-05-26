public class IngressoFamilia extends Ingresso {

    private int numeroPessoas;

    public IngressoFamilia(double valorBase, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valorBase, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double calcularValor() {
        double valorTotal =  super.calcularValor() * this.numeroPessoas;
        if (this.numeroPessoas > 3) {
            valorTotal = valorTotal * 0.95;
        }
        return valorTotal;
    }
}
