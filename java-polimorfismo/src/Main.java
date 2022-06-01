import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.setNome("André Luís");
        andre.setCpf("1");
        andre.setProfissao("Desenvolvedor Java");
        Cliente orlei = new Cliente();
        orlei.setNome("Orlei Luís");
        orlei.setCpf("2");
        orlei.setProfissao("Trader");
        String cpfDigitado = JOptionPane.showInputDialog(null, "Digite seu cpf:");
        boolean foiPermitidoAcesso = andre.podeAcessar(cpfDigitado);
        boolean foiPermitidoAcesso2 = orlei.podeAcessar(cpfDigitado);
        if (foiPermitidoAcesso || foiPermitidoAcesso2) {

            Conta contaAndre = new Conta(31, 4251);
            contaAndre.setTitular(andre);
            contaAndre.deposita(5000);
            Conta contaOrlei = new Conta(31, 4251);
            contaOrlei.setTitular(orlei);
            contaAndre.deposita(5000);
            System.out.println("Contas criadas: " + Conta.getTotalDeContas());
            System.out.println();

            switch (cpfDigitado) {
                case "1" -> JOptionPane.showMessageDialog(null, "Informações de cliente \n"
                        + andre.informacoesDeCliente(andre.getNome(), andre.getCpf(), andre.getProfissao())
                        + " \nInformações da conta acessada \n" + " \nTitular: " + contaAndre.getTitular().getNome() +
                        " \nag conta:" + contaAndre.getAgencia() + " \nnúmero da conta: " + contaAndre.getNumero() +
                        " \nsaldo: R$" + contaAndre.getSaldo());
                case "2" -> JOptionPane.showMessageDialog(null, "Informações de cliente \n"
                        + orlei.informacoesDeCliente(orlei.getNome(), orlei.getCpf(), orlei.getProfissao())
                        + " \nInformações da conta acessada \n" + " \nTitular: " + contaOrlei.getTitular().getNome() +
                        " \nag conta:" + contaOrlei.getAgencia() + " \nnúmero da conta: " + contaOrlei.getNumero() +
                        " \nsaldo: R$" + contaOrlei.getSaldo());
                default -> {
                }
            }
           
        } else {
            JOptionPane.showMessageDialog(null, "Não identificado");
        }

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("André");
        funcionario1.setCpf("434.3.43.53-53");
        funcionario1.setSalario(2600);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getCpf());
        System.out.println(funcionario1.pegarBonificacao());

        Gerente g1 = new Gerente();
        g1.setNome("orlei");
        g1.setCpf("234.4.56.93-53");
        g1.setSalario(2600);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.pegarBonificacao());

        g1.setSenha(222);

        g1.autentica(222);

    }
}
