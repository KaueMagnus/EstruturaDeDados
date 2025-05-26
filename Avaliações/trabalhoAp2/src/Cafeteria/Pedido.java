package Cafeteria;

public class Pedido {
    int id;
    String descricao;

    public Pedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String toString() {
        return "Pedido ID: " + id + ", Descrição: " + descricao;
    }
}

