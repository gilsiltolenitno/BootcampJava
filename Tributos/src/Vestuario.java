public class Vestuario extends Produto {
    public Vestuario(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.025; // Imposto para vestuário
    }
}
