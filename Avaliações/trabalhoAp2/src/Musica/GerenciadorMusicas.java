package Musica;

import java.util.Scanner;

public class GerenciadorMusicas {
    public static void main(String[] args) {
        PlaylistDupla playlist = new PlaylistDupla();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n🎶 Gerenciador de Músicas 🎶");
            System.out.println("1. Próxima música");
            System.out.println("2. Música anterior");
            System.out.println("3. Ordenar playlist");
            System.out.println("4. Tocar música");
            System.out.println("5. Adicionar música");
            System.out.println("6. Remover música");
            System.out.println("7. Listar músicas");
            System.out.println("8. Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1:
                    playlist.proxima();
                    break;
                case 2:
                    playlist.anterior();
                    break;
                case 3:
                    System.out.print("Ordenar por (titulo/artista): ");
                    String criterio = sc.nextLine();
                    if (criterio.equalsIgnoreCase("titulo"))
                        playlist.ordenarPorTitulo();
                    else
                        playlist.ordenarPorArtista();
                    break;
                case 4:
                    playlist.tocarAtual();
                    break;
                case 5:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Álbum: ");
                    String album = sc.nextLine();
                    System.out.print("Duração (segundos): ");
                    int duracao = sc.nextInt(); sc.nextLine();
                    System.out.print("Posição (i=início, f=fim, n=número): ");
                    String pos = sc.nextLine();

                    Musica m = new Musica(titulo, artista, album, duracao);
                    if (pos.equals("i")) playlist.adicionarInicio(m);
                    else if (pos.equals("f")) playlist.adicionarFim(m);
                    else {
                        int p = Integer.parseInt(pos);
                        playlist.adicionarNaPosicao(m, p);
                    }
                    break;
                case 6:
                    System.out.print("Título da música a remover: ");
                    String tituloRemover = sc.nextLine();
                    playlist.removerPorTitulo(tituloRemover);
                    break;
                case 7:
                    playlist.listar();
                    break;
                case 8:
                    System.out.println("Encerrando programa...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
