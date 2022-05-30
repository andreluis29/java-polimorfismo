import javax.swing.JOptionPane;

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
        if (foiPermitidoAcesso == true || foiPermitidoAcesso2 == true) {

            Conta contaAndre = new Conta(31, 4251);
            contaAndre.setTitular(andre);
            contaAndre.deposita(5000);
            Conta contaOrlei = new Conta(31, 4251);
            contaOrlei.setTitular(orlei);
            contaAndre.deposita(5000);
            System.out.println("Contas criadas: " + Conta.getTotalDeContas());
            System.out.println();
            
            switch(cpfDigitado) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Informações de cliente \n" 
                    + andre.informacoesDeCliente(andre.getNome(), andre.getCpf(), andre.getProfissao())
                    + " \nInformações da conta acessada \n" + " \nTitular: " + contaAndre.getTitular().getNome() +
                    " \nag conta:" + contaAndre.getAgencia() + " \nnúmero da conta: " + contaAndre.getNumero() +
                    " \nsaldo: R$" + contaAndre.getSaldo());
                break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Informações de cliente \n" 
                    + orlei.informacoesDeCliente(orlei.getNome(), orlei.getCpf(), orlei.getProfissao())
                    + " \nInformações da conta acessada \n" + " \nTitular: " + contaOrlei.getTitular().getNome() +
                    " \nag conta:" + contaOrlei.getAgencia() + " \nnúmero da conta: " + contaOrlei.getNumero() +
                    " \nsaldo: R$" + contaOrlei.getSaldo());
                break;
                default: 
                break;
            }
           
        } else {
            JOptionPane.showMessageDialog(null, "Não identificado");
        }
    }
}
