public class Main {
    public static void main(String[] args) {

        // Instanciando objeto do tipo Ordenacao
        Ordenacao ordenar = new Ordenacao();

        int[] numeros = {22, 4, 8, 12, 1, 36};

        // BUBBLE SORT
//        ordenar.listar(numeros);
//        ordenar.bubbleSort(numeros);
//        ordenar.listar(numeros);

        // SELECTION SORT
//        ordenar.listar(numeros);
//        ordenar.selectionSort(numeros);
//        ordenar.listar(numeros);

        // INSERTION SORT
        ordenar.listar(numeros);
        ordenar.insertionSort(numeros);
        ordenar.listar(numeros);
    }
}
