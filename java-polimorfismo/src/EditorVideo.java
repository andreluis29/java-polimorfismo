public class EditorVideo extends Funcionario {
    @Override
    public double pegarBonificacao() {
        return pegarBonificacao() + super.getSalario();
    }

}
