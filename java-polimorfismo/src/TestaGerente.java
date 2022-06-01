public class TestaGerente {
    public static void main(String[] args) {
        Funcionario andre = new Gerente();

        andre.setNome("André");
        String nome = andre.getNome();
        andre.setSalario(3000);
        System.out.println(nome);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(andre);
        System.out.println("Sua bonificação é: " + controleBonificacao.getSoma());
    }
}