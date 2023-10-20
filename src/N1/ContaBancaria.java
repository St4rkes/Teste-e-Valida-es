package N1;

public class ContaBancaria {
	private double saldo;
    private int numeroDaConta;

        public ContaBancaria(int numeroDaConta, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar um valor
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Método para sacar um valor
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

}
