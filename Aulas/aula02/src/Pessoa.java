public class Pessoa {
    private String nome;
    private String telefone;

    public void logar() {
        System.out.println("Usuário logado com sucesso! ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
