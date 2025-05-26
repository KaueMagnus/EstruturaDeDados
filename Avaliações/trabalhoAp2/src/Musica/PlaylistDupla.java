package Musica;

public class PlaylistDupla {
    private NoDuplo inicio, fim, atual;

    public void adicionarInicio(Musica musica) {
        NoDuplo novo = new NoDuplo(musica);
        if (inicio == null) {
            inicio = fim = atual = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void adicionarFim(Musica musica) {
        NoDuplo novo = new NoDuplo(musica);
        if (fim == null) {
            inicio = fim = atual = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void adicionarNaPosicao(Musica musica, int posicao) {
        if (posicao <= 0) {
            adicionarInicio(musica);
            return;
        }

        NoDuplo novo = new NoDuplo(musica);
        NoDuplo temp = inicio;
        int i = 0;

        while (temp != null && i < posicao) {
            temp = temp.proximo;
            i++;
        }

        if (temp == null) {
            adicionarFim(musica);
        } else {
            novo.proximo = temp;
            novo.anterior = temp.anterior;
            if (temp.anterior != null) temp.anterior.proximo = novo;
            temp.anterior = novo;
            if (temp == inicio) inicio = novo;
        }
    }

    public void removerPorTitulo(String titulo) {
        NoDuplo temp = inicio;

        while (temp != null) {
            if (temp.musica.titulo.equalsIgnoreCase(titulo)) {
                if (temp == inicio) {
                    inicio = temp.proximo;
                    if (inicio != null) inicio.anterior = null;
                } else if (temp == fim) {
                    fim = temp.anterior;
                    if (fim != null) fim.proximo = null;
                } else {
                    temp.anterior.proximo = temp.proximo;
                    temp.proximo.anterior = temp.anterior;
                }

                if (temp == atual) atual = inicio; // resetar a atual
                System.out.println("Música removida: " + titulo);
                return;
            }
            temp = temp.proximo;
        }

        System.out.println("Música não encontrada.");
    }

    public void listar() {
        NoDuplo temp = inicio;
        if (temp == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        while (temp != null) {
            System.out.println(temp.musica);
            temp = temp.proximo;
        }
    }

    public void tocarAtual() {
        if (atual == null) {
            System.out.println("Nenhuma música selecionada.");
        } else {
            System.out.println("Tocando agora: " + atual.musica);
        }
    }

    public void proxima() {
        if (atual != null && atual.proximo != null) {
            atual = atual.proximo;
            tocarAtual();
        } else {
            System.out.println("Você já está na última música.");
        }
    }

    public void anterior() {
        if (atual != null && atual.anterior != null) {
            atual = atual.anterior;
            tocarAtual();
        } else {
            System.out.println("Você já está na primeira música.");
        }
    }

    public void ordenarPorTitulo() {
        ordenar("titulo");
    }

    public void ordenarPorArtista() {
        ordenar("artista");
    }

    private void ordenar(String criterio) {
        if (inicio == null || inicio.proximo == null) return;

        for (NoDuplo i = inicio; i != null; i = i.proximo) {
            for (NoDuplo j = i.proximo; j != null; j = j.proximo) {
                boolean trocar = false;
                if (criterio.equals("titulo") && i.musica.titulo.compareToIgnoreCase(j.musica.titulo) > 0)
                    trocar = true;
                if (criterio.equals("artista") && i.musica.artista.compareToIgnoreCase(j.musica.artista) > 0)
                    trocar = true;

                if (trocar) {
                    Musica temp = i.musica;
                    i.musica = j.musica;
                    j.musica = temp;
                }
            }
        }

        atual = inicio;
        System.out.println("Playlist ordenada por " + criterio + ".");
    }
}

