public class TestaCc {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22, 222);
        cc.deposita(200);

        ContaPoupança cp = new ContaPoupança(22, 222);
        cp.deposita(200);

        cc.transfere(10, cp);


        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());

        cc.saca(100);
        System.out.println("Saque de: " + cc.getSaldo() + " da Conta Corrente");
    }
}
