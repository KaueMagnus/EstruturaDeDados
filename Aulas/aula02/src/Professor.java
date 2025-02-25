public class Professor extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void logar() {
        System.out.println("Professor logado com sucesso!");
    }
}
