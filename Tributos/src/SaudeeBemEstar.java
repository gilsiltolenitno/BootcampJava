public class SaudeeBemEstar extends Produto {
    public SaudeeBemEstar(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        return getValor() * 0.015; // Imposto para produtos de saúde e bem-estar
    }
}
