public abstract class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public abstract double calcularImposto();

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Imposto: R$ " + String.format("%.2f", calcularImposto()));
        System.out.println("Valor Total: R$ " + String.format("%.2f", valor + calcularImposto()));
    }
}
