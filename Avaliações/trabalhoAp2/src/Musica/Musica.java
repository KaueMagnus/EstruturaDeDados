package Musica;

public class Musica {
    String titulo, artista, album;
    int duracao;

    public Musica(String titulo, String artista, String album, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    public String toString() {
        return "🎵 " + titulo + " - " + artista + " | Álbum: " + album + " | Duração: " + duracao + "s";
    }
}
