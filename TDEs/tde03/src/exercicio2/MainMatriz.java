package exercicio2;

public class MainMatriz {
    public static void main(String[] args) {
        int[][] dados = {
                {3, 5, 2},
                {8, 1, 4},
                {6, 7, 9}
        };

        Matriz matriz = new Matriz(dados);

        // Obter maior e menor elemento
        System.out.println("Maior elemento: " + matriz.obterMaior());
        System.out.println("Menor elemento: " + matriz.obterMenor());

        // Calcular média
        System.out.println("Média dos elementos: " + matriz.calcularMedia());

        // Soma por linha
        int[] somaLinhas = matriz.somarPorLinha();
        System.out.print("Soma por linha: ");
        for (int soma : somaLinhas) {
            System.out.print(soma + " ");
        }
        System.out.println();

        // Soma por coluna
        int[] somaColunas = matriz.somarPorColuna();
        System.out.print("Soma por coluna: ");
        for (int soma : somaColunas) {
            System.out.print(soma + " ");
        }
        System.out.println();

        // Soma total
        System.out.println("Soma total da matriz: " + matriz.somaTotal());

        // Contar ocorrências
        int valorProcurado = 4;
        System.out.println("O valor " + valorProcurado + " aparece " + matriz.contarOcorrencias(valorProcurado) + " vezes.");
    }
}
