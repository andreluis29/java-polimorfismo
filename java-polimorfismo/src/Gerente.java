public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double pegarBonificacao() {
        return pegarBonificacao() + super.getSalario();
    }

    public int getSenha() {
        return this.senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
        
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

}
