public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario funcao) {
        double bonificacao = funcao.pegarBonificacao();
        this.soma = funcao.getSalario() + bonificacao;
    }

    public double getSoma(){
        return this.soma;
    }

}
