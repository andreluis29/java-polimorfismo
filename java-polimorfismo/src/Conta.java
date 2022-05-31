public class Conta {
    private double saldo;
    private int numero;
    private int agencia;
    private static int totalDeContas;
    private Cliente titular;

    public Conta(int agencia, int numero) {
        totalDeContas = totalDeContas + 1;
        if (agencia > 0 && numero > 0) {
            this.agencia = agencia;
            this.numero = numero;
        }
        return;
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }
    
    public boolean transfere(double valor, Conta conta){
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.deposita(valor);    
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public Cliente setTitular(Cliente titular) {
        return this.titular = titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }
}
