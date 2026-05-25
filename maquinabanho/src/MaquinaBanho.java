public class MaquinaBanho {

    private int agua;
    private int shampoo;
    private boolean temPet;
    private boolean petLimpo;
    private boolean maquinaSuja;

    public MaquinaBanho() {
        this.agua = 0;
        this.shampoo = 0;
        this.temPet = false;
        this.petLimpo = false;
        this.maquinaSuja = false;
    }
    public void colocarPet() {

        if (temPet) {
            System.out.println("Erro: Já existe um pet dentro da máquina!");
            return;
        }
        if (maquinaSuja) {
            System.out.println("Erro: A máquina está suja! Faça a limpeza antes de colocar o pet.");
            return;
        }
        this.temPet = true;
        this.petLimpo = false;
        System.out.println("Pet colocado na máquina com sucesso. Pronto para o banho!");
    }
    public void abastecerAgua() {
        if (agua + 2 <= 30) {
            agua = agua + 2;
            System.out.println("Água abastecida! Nível atual: " + agua + " litros.");
        } else {
            System.out.println("Aviso: O tanque de água já atingiu o limite máximo de 30 litros!");
        }
    }

    public void abastecerShampoo() {
        if (shampoo + 2 <= 10) {
            shampoo = shampoo + 2;
            System.out.println("Shampoo abastecido! Nível atual: " + shampoo + " litros.");
        } else {
            System.out.println("Aviso: O compartimento de shampoo já atingiu o limite máximo de 10 litros!");
        }
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Atenção! Não há nenhum pet na máquina para banho!");
            return;
        }

        if (petLimpo) {
            System.out.println("Atenção! Este pet já tomou banho!");
            return;
        }
        if (agua < 10 || shampoo < 2) {
            System.out.println("Atenção! Insumos insuficientes! Água atual: " + agua + "L, Shampoo: " + shampoo +"L.");
            return;
        }
        this.agua = this.agua -10;
        this.shampoo = this.shampoo - 2;
        this.petLimpo = true;
        this.maquinaSuja = true;

        System.out.println("Banho finalizado com sucesso! Pest está limpo.");
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Atenção! Não há nenhum pet a ser retirado da máquina.");
            return;
        }
        if (!petLimpo) {
            this.maquinaSuja = true;
            System.out.println("Atenção: O pet foi retirado sem finalizar o banho! A máquina ficou suja, é preciso limpa-la.");
        } else {
            System.out.println("Pet limpo, pronto para ir para casa.");
        }
        this.temPet = false;
        this.petLimpo = false;
    }

    public void limparMaquina() {
        if (!maquinaSuja) {
            System.out.println("Atenção! A máquina já está limpa! Não há necessidade de limpeza. ");
            return;
        }
        if (temPet) {
            System.out.println("Atenção! Não é possivel fazer limpeza com pet dentro da máquina.");
            return;
        }
        if (agua < 3 || shampoo < 1) {
            System.out.println("Atenção! Insumos insuficientes para limpeza! Água atual: " + agua + "L, Shampoo: " + shampoo + "L.");
            return;
        }

        this.agua = this.agua - 3;
        this.shampoo = this.shampoo - 1;
        this.maquinaSuja = false;

        System.out.println("Limpeza realizada com sucesso! Pronto para receber o próximo pet.");
    }


    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + this.agua + " / 30 litros.");
    }


    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + this.shampoo + " / 10 litros.");
    }


    public void verificarEstadoPet() {
        if (!temPet) {
            System.out.println("A máquina está vazia. Não há nenhum animal aqui.");
        } else if (!petLimpo) {
            System.out.println("Existe um animal na máquina e ele ainda NÃO tomou banho!");
        } else {
            System.out.println("Existe um animal na máquina e ele já está limpo.");
        }
    }


}
