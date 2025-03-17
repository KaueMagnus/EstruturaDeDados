package exercicio1;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        elementos[tamanho++] = elemento;
    }

    public void adicionar(int posicao, String elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public String obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return elementos[posicao];
    }

    public void alterar(int posicao, String elemento) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        elementos[posicao] = elemento;
    }

    private void aumentarCapacidade() {
        String[] novoArray = new String[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
    }

    public boolean remover(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                remover(i);
                return true;
            }
        }
        return false;
    }

    public boolean existe(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}