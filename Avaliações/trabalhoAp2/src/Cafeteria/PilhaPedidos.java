package Cafeteria;

public class PilhaPedidos {
    private No topo;

    public void push(Pedido pedido) {
        No novo = new No(pedido);
        novo.proximo = topo;
        topo = novo;
    }

    public Pedido pop() {
        if (topo == null) return null;
        Pedido pedido = topo.pedido;
        topo = topo.proximo;
        return pedido;
    }

    public void printStack() {
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
