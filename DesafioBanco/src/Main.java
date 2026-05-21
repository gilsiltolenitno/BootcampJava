import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria(1000.0);

        int opcao = 0;
        do {
            System.out.println("\n==== MENU DO BANCO ====");
            System.out.println("1 - CONSULTA SALDO");
            System.out.println("2 - COSNSULTA CHEQUE ESPECIAL");
            System.out.println("3 - DEPOSITAR");
            System.out.println("4 - SACAR");
            System.out.println("5 - PAGAR BOLETO");
            System.out.println("6 - VERIFICAR CHEQUE ESPECIAL");
            System.out.println("0 - SAIR");
            System.out.print("ESCOLHA UMA OPCAO");

            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo Disponivel: " + minhaConta.getSaldo());
                    if (minhaConta.getSaldo() == 0) {
                        System.out.println("Atenção voce entrou no cheque especial! " + " Limite Cheque Especial Disponível = " + minhaConta.getChequeEspecial());
                    }
                    break;
                case 2:
                    System.out.println("Cheque Especial = " + minhaConta.getChequeEspecial());
                    break;
                case 3:
                    System.out.println("Digite o valor para Deposito");
                    double vDeposito = teclado.nextDouble();

                    minhaConta.depositar(vDeposito);
                    System.out.println("Depósito Realizado");
                    break;
                case 4:
                    System.out.println("\n--- Digite o valor do Saque ---");
                    double vSacar = teclado.nextDouble();
                    minhaConta.sacar(vSacar);
                    if (minhaConta.getSaldo() == 0) {
                        System.out.println("Atenção voce entrou no cheque especial!" + "Limite Cheque Especial Disponível" + minhaConta.getChequeEspecial());
                    } else {
                        System.out.println("Saldo Atualizado = " + minhaConta.getSaldo());
                    }
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto");
                    double vBoleto = teclado.nextDouble();
                    minhaConta.pagarBoleto(vBoleto);
                    break;
                case 6:
                    if (minhaConta.isUsandoChequeEspecial()) {
                        System.out.println("Alerta: Você esta utilizando cheque especial");
                        System.out.println(minhaConta.getChequeEspecial());
                    } else {
                        System.out.println("Você não está utilizando cheque especial");
                        System.out.println(minhaConta.getChequeEspecial());
                    }
                    break;
                case 0:
                    System.out.println("Saindo do Sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 0);


    }
}
