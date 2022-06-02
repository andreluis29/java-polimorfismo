public class Cliente implements Autenticavel {
    
    private String nome, cpf, profissao;
    private int senha;
    
    public boolean podeAcessar(String cpf) {
        if (this.cpf.equals(cpf)) {
            return true;
        }
        return false;
    }

    public String informacoesDeCliente(String nome, String cpf, String profissao) {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nProfissão " + profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public String setProfissao(String profissao) {
        return this.profissao = profissao;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
        
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false; 
        }
       
    }
}
