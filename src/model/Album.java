package model; //definir pacote de classes

import java.util.List; //importar classes necessarias
import java.util.ArrayList; //importar classes necessarias

public class Album {
    private String nome; //nome do album
    private int ano; //ano do album
    private List<Musica> musicas; //lista de musicas do album

    public Album(String nome, int ano) { //construtor do album
        this.nome = nome;
        this.ano = ano;
        this.musicas = new ArrayList<>(); //inicializa lista vazia
    }

    public Album(String nome, int ano, List<Musica> musicas) { //construtor do album com lista de musicas
        this.nome = nome;
        this.ano = ano;
        this.musicas = musicas; 
    }

    public String getNome() { //obter nome do album
        return nome;
    }

    public void setNome(String nome) { //definir nome do album
        this.nome = nome;
    }

    public int getAno() { //obter ano do album
        return ano;
    }

    public void setAno(int ano) { //definir ano do album
        this.ano = ano;
    }

    public List<Musica> getMusicas() { //obter musicas do album
        return musicas;
    }

    public void addMusica(Musica musica) { //adicionar musica ao album
        musicas.add(musica);
    }

    public void addMusicas(List<Musica> musicas){ //adicionar lista de musicas ao album
        this.musicas.addAll(musicas);
    }
}
