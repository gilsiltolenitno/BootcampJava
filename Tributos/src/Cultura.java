public class Cultura extends Produto {
    public Cultura(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.04; // Imposto para produtos culturais
    }
}
