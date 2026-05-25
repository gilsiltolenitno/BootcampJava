public class Main {
    public static void main(String[] args) {

        MaquinaBanho maquina = new MaquinaBanho();

        System.out.println("--- INICIANDO OPERAÇÃO DA PETSHOP ---\n");

        maquina.colocarPet();
        maquina.darBanho();
        maquina.retirarPet();

        System.out.println("\n--- ABASTECENDO A MÁQUINA ---");

        for (int i = 0; i < 7; i++) { maquina.abastecerAgua(); }
        for (int i = 0; i < 2; i++) { maquina.abastecerShampoo(); }

        System.out.println("\n--- TENTANDO USAR A MÁQUINA SUJA ---");

        maquina.colocarPet();
        maquina.limparMaquina();

        System.out.println("\n--- FLUXO DE BANHO ---");

        maquina.colocarPet();
        maquina.verificarEstadoPet();
        maquina.darBanho();
        maquina.verificarEstadoPet();
        maquina.retirarPet();

        System.out.println("\n--- STATUS DOS INSUMOS ---");

        maquina.verificarNivelAgua();
        maquina.verificarNivelShampoo();

    }
}
