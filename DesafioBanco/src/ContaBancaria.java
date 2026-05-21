public class ContaBancaria {
    private double saldo;
    private double cheque_especial;
    private double taxa;
    private double limiteMaximoCheque;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            cheque_especial = 50.0;

        } else {
            cheque_especial = depositoInicial * 0.5;
        }
        this.limiteMaximoCheque = this.cheque_especial;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return cheque_especial;
    }

    public void depositar(double valor) {
        double quantoFaltaCheque = limiteMaximoCheque - cheque_especial;
        if (quantoFaltaCheque > 0) {
            if (valor <= quantoFaltaCheque) {
                cheque_especial = cheque_especial + valor;
            } else {
                cheque_especial = limiteMaximoCheque;
                double sobra = valor - quantoFaltaCheque;
                saldo = saldo + sobra;
            }
        } else {
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor) {
        if (saldo + cheque_especial < valor) {
            System.out.println("Saldo Insuficiente");
        } else if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            double restou = valor - saldo;
            saldo = 0;
            cheque_especial = cheque_especial - restou;
            taxa = taxa + (restou * 0.2);
        }
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
    }

    public boolean isUsandoChequeEspecial() {
        return taxa > 0;
    }
}
