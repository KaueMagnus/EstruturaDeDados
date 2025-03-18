// AULA 04

public class Ordenacao {

    // Ordenação com Bubble Sort.
    public void bubbleSort(int[] vetor) {

        int n = vetor.length;

        for (int i =0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp =  vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Ordenação com Selection Sort.
    public void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] <  vetor[min_index]) {
                    min_index = j;
                }
            }
            int temp = vetor[min_index];
            vetor[min_index] = vetor[i];
            vetor[i] = temp;
        }
    }

    // Ordenação com Insertion Sort.
    public void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    // Metodo para imprimir
    public void listar(int[] vetor) {
        String texto = "";
        for(int i = 0; i < vetor.length; i++){
            texto += vetor[i] + " ";
        }
        System.out.println(texto);
    }
}
