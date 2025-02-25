public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Kaue");
        pessoa1.setTelefone("48-99660-1083");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        pessoa1.logar();

        System.out.println();

        Professor professor1 = new Professor();

        professor1.setNome("Juliano");
        professor1.setTelefone("48-93360-1214");
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Telefone: " + professor1.getTelefone());

        professor1.logar();
    }
}
