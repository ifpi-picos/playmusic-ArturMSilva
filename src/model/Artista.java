package model; //definir pacote de classes

import java.util.List; //importar classes necessarias
import java.util.ArrayList; //importar classes necessarias

public class Artista {
    private String nome; //nome do artista
    private List<Album> albuns; //lista de albuns do artista

    public Artista(String nome) { //construtor do artista
        this.nome = nome;
        this.albuns = new ArrayList<>(); //inicializa lista vazia
    }

    public Artista(String nome, List<Album> albuns) { //construtor do artista com lista de albuns
        this.nome = nome;
        this.albuns = albuns;
    }
    
    public String getNome() { //obter nome do artista
        return nome;
    }

    public void setNome(String nome) { //definir nome do artista
        this.nome = nome;
    }

    public List<Album> getAlbuns() { //obter albuns do artista
        return albuns;
    }

    public void addAlbum(Album album){ //adicionar album ao artista
        albuns.add(album);
    }

    public void addAlbuns(List<Album> albuns) {  //adicionar lista de albuns ao artista
        this.albuns.addAll(albuns);
    }

}
