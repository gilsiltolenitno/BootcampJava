public class Main {
    public static void main(String[] args) {
        Produto alimento = new Alimentacao("Arroz", 10.00);
        Produto livro = new Cultura("Livro de História", 50.00);
        Produto camiseta = new Vestuario("Camiseta Estampada", 80.00);
        Produto medicamento  = new SaudeeBemEstar("Suplemento Vitaminico", 120.00);

        Produto[] produtos = {alimento, medicamento, camiseta, livro};
        System.out.println("--- Cálculo dos Tributos ---\n");

        double totalValor = 0;
        double totalImposto = 0;
        for (Produto p : produtos) {
            p.exibirInformacoes();
            System.out.println("-----------------------------");
            totalValor += p.getValor();
            totalImposto += p.calcularImposto();
        }
        System.out.println("\n=======RESUMO========");
        System.out.println("Valor Total dos Produtos: R$ " + String.format("%.2f", totalValor));
        System.out.println("Valor Total dos Impostos: R$ " + String.format("%.2f", totalImposto));
        System.out.println("Valor Total a Pagar: R$ " + String.format("%.2f", totalValor + totalImposto));
    }

}
