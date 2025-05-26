package Cafeteria;

import java.util.Scanner;

public class SistemaCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaPedidos fila = new FilaPedidos();
        PilhaPedidos pilha = new PilhaPedidos();
        int contadorId = 1;

        while (true) {
            System.out.println("\n1. Adicionar Novo Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Restaurar Pedido");
            System.out.println("5. Imprimir Pedidos Pendentes");
            System.out.println("6. Imprimir Pedidos Cancelados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição do Pedido: ");
                    String desc = sc.nextLine();
                    fila.enqueue(new Pedido(contadorId++, desc));
                    break;
                case 2:
                    Pedido atendido = fila.dequeue();
                    System.out.println(atendido != null ? "Pedido atendido: " + atendido : "Nenhum pedido para atender.");
                    break;
                case 3:
                    Pedido cancelado = fila.dequeue();
                    if (cancelado != null) {
                        pilha.push(cancelado);
                        System.out.println("Pedido cancelado: " + cancelado);
                    } else System.out.println("Nenhum pedido para cancelar.");
                    break;
                case 4:
                    Pedido restaurado = pilha.pop();
                    if (restaurado != null) {
                        fila.enqueue(restaurado);
                        System.out.println("Pedido restaurado: " + restaurado);
                    } else System.out.println("Nenhum pedido para restaurar.");
                    break;
                case 5:
                    System.out.println("Pedidos Pendentes:");
                    fila.printQueue();
                    break;
                case 6:
                    System.out.println("Pedidos Cancelados:");
                    pilha.printStack();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
