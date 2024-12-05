package model;

import java.util.List;
import java.util.ArrayList; //

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) { //construtor da playlist
        this.nome = nome;
        this.musicas = new ArrayList<>(); //inicializa lista vazia
        }

    public Playlist(String nome, List<Musica> musicas) { //construtor da playlist
        this.nome = nome;
        this.musicas = musicas;
    }

    public String getNome() { //obter nome da playlist
        return nome;
    }

    public void setNome(String nome) { //definir nome da playlist
        this.nome = nome;
    }

    public Musica getMusica(int index) {
        if (index >= 0 && index < musicas.size()) {
            return musicas.get(index);
        }
        return null;
    }

    public List<Musica> getMusicas() { //obter musicas da playlist
        return musicas;
    }

    public void addMusica(Musica musica) { //adicionar musica a playlist
        musicas.add(musica);
    }
    
    public void addMusicas(List<Musica> musicas) { //adicionar lista de musicas a playlist
        this.musicas.addAll(musicas);
    }

    public int tamanho() {
        return musicas.size();
    }
}
