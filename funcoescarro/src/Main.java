import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro meuCarro = new Carro();

        int opcao;

        do {
            System.out.println("\n==== PAINEL DO CARRO ====");
            System.out.println("1 - LIGAR O CARRO");
            System.out.println("2 - DESLIGAR O CARRO");
            System.out.println("3 - ACELERAR ( +1 Km/h )");
            System.out.println("4 - DIMINUIR VELOCIDADE ( -1 Km/h )");
            System.out.println("5 - TROCAR A MARCHA");
            System.out.println("6 - VIRAR O CARRO (CURVA)");
            System.out.println("7 - MONITORAR PAINEL (VER VELOCIDADE)");
            System.out.println("0 - SAIR DO SIMULADOR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    meuCarro.ligar();
                    System.out.println("Motor ligado! Vrum vrum...");
                    break;
                case 2:
                    meuCarro.desligar();
                    break;
                case 3:
                    meuCarro.acelerar();
                    break;
                case 4:
                    meuCarro.diminuir();
                    break;
                case 5:
                    System.out.print("Digite a nova marcha (0 a 6): ");
                    int novaMarcha = teclado.nextInt();
                    meuCarro.trocarMarcha(novaMarcha);
                    break;
                case 6:
                    System.out.print("Digite o lado (Esquerda / Direita): ");
                    String lado = teclado.next();
                    meuCarro.direitaesquerda(lado);
                    break;
                case 7:
                    meuCarro.verificarVelocidade();
                    break;
                case 0:
                    System.out.println("Simulador encerrado. Até a próxima corrida!");
                    break;
                default:
                    System.out.println("Comando inválido no painel!");
            }
        } while (opcao != 0);

        teclado.close();
        }
    }

