public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(double valorBase, String nomeFilme, boolean dublado) {
        super(valorBase, nomeFilme, dublado);
    }

    @Override
    public double calcularValor() {
        return super.calcularValor() / 2;
    }
}
