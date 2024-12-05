package model;

public class Musica {
    private String nome; //nome da musica
    private String genero; //genero da musica
    private String arquivoAudio; //caminho do arquivo de audio
    private int duracao; //duracao da musica em segundos

    public Musica(String nome, String genero, String arquivoAudio, int duracao) { //construtor da musica
        this.nome = nome;
        this.genero = genero;
        this.arquivoAudio = arquivoAudio;
        this.duracao = duracao;
    }

    public String getNome() { //obter nome da musica
        return nome;
    }

    public void setNome(String nome) { //definir nome da musica
        this.nome = nome;
    }

    public String getGenero() { //obter genero da musica
        return genero;
    }

    public void setGenero(String genero) {  //definir genero da musica
        this.genero = genero;
    }

    public String getArquivoAudio() { //obter caminho do arquivo de audio
        return arquivoAudio;
    }

    public void setArquivoAudio(String arquivoAudio) { //definir caminho do arquivo de audio
        this.arquivoAudio = arquivoAudio;
    }

    public int getDuracao() { //obter duracao da musica
        return duracao;
    }

    public void setDuracao(int duracao) { //definir duracao da musica
        this.duracao = duracao;
    }

}
