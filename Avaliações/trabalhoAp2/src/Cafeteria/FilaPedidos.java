package Cafeteria;

public class FilaPedidos {
    private No inicio, fim;

    public void enqueue(Pedido pedido) {
        No novo = new No(pedido);
        if (fim != null) fim.proximo = novo;
        else inicio = novo;
        fim = novo;
    }

    public Pedido dequeue() {
        if (inicio == null) return null;
        Pedido pedido = inicio.pedido;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return pedido;
    }

    public void printQueue() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
