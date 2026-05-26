public class Main {
    public static void main(String[] args) {
        Ingresso meia = new MeiaEntrada(30.0,"Vingadores", false);
        System.out.println("Valor da meia entrada: R$ " + meia.calcularValor());

        Ingresso familia = new IngressoFamilia(30.00, "Vingadores", false,4);
        System.out.println("Valor do ingresso família: R$ " + familia.calcularValor());
    }
}
