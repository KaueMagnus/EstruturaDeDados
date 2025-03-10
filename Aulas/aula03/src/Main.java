public class Main {
    public static void main(String[] args) {

        // VETORES

        // Declarando e inicializando
        int[] notas = new int[3];

        // Preenchendo o vetor
        notas[0] = 5;
        notas[1] = 7;
        notas[2] = 10;

        // Printando o vetor com um loop.
        for (int i = 0; i < notas.length; i++) {
        //    System.out.println(notas[i]);
        }

        // Printando o vetor de forma inversa.
        for (int i = notas.length - 1; i >= 0; i--) {
        //    System.out.println(notas[i]);
        }

        // Printando o vetor com for each.
        for (int nota : notas) {
        //    System.out.println(nota);
        }

        // Declarando e preenchendo vetor de String.
        String[] nomes = {"Kaue", "Joana", "Giani"};
        // System.out.println("Tamanho do vetor: " + nomes.length);
        // System.out.println("Posição 1: " + nomes[0]);


        // MATRIZ

        int[][] matriz = new  int[2][4];

        matriz[0][0] = 1; // Primeira linha e primeira coluna.
        matriz[0][1] = 2; // Primeira linha e segunda coluna.
        matriz[1][0] = 3; // Segunda linha e primeira coluna.
        matriz[1][1] = 4; // Segunda linha e segunda coluna.


        // Iterando  e printando toda a matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }

        }

        // Declarando e preenchendo a matriz.
        int[][] matriz2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Printando a terceira linha e segunda coluna.
        System.out.println(matriz2[2][1]);

    }
}
