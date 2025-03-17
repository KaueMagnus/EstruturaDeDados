package exercicio1;

public class MainVetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        // Adicionar elementos
        vetor.adicionar("Maçã");
        vetor.adicionar("Banana");
        vetor.adicionar("Laranja");
        System.out.println("Vetor após adições: " + vetor);

        // Testar aumento de capacidade
        vetor.adicionar("Uva");
        System.out.println("Vetor após aumento de capacidade: " + vetor);

        // Adicionar em uma posição específica
        vetor.adicionar(1, "Pera");
        System.out.println("Vetor após inserção na posição 1: " + vetor);

        // Obter elemento
        System.out.println("Elemento na posição 2: " + vetor.obter(2));

        // Alterar elemento
        vetor.alterar(0, "Manga");
        System.out.println("Vetor após alteração: " + vetor);

        // Remover pelo índice
        vetor.remover(2);
        System.out.println("Vetor após remoção pelo índice: " + vetor);

        // Remover pelo valor
        vetor.remover("Banana");
        System.out.println("Vetor após remoção pelo valor: " + vetor);

        // Verificar existência
        System.out.println("Existe 'Manga'? " + vetor.existe("Manga"));
        System.out.println("Existe 'Banana'? " + vetor.existe("Banana"));

        // Obter tamanho
        System.out.println("Tamanho atual: " + vetor.tamanho());

        // Verificar se está vazio
        System.out.println("O vetor está vazio? " + vetor.estaVazio());

        // Limpar vetor
        vetor.limpar();
        System.out.println("Vetor após limpar: " + vetor);
    }
}
