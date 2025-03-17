package exercicio2;

public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int obterMaior() {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public int obterMenor() {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public double calcularMedia() {
        int soma = 0, elementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                elementos++;
            }
        }
        return (double) soma / elementos;
    }

    public int[] somarPorLinha() {
        int[] somaLinhas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }
        return somaLinhas;
    }

    public int[] somarPorColuna() {
        int colunas = matriz[0].length;
        int[] somaColunas = new int[colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < colunas; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        return somaColunas;
    }

    public int somaTotal() {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public int contarOcorrencias(int valor) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
