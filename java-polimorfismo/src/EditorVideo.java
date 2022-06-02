public class EditorVideo extends Funcionario implements Autenticavel {
    @Override
    public double pegarBonificacao() {
        return pegarBonificacao() + super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean autentica(int senha) {
        // TODO Auto-generated method stub
        return false;
    }

}
