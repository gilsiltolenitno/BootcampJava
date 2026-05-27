public class Alimentacao extends Produto {
    public Alimentacao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
            return getValor() * 0.01; // Imposto padrão para alimentos não orgânicos
        }
    }

