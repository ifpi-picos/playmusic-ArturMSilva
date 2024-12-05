# PlayMusic

**PlayMusic** é um projeto de um player de música simples desenvolvido em Java, com uma interface gráfica básica que permite reproduzir, pausar, avançar e retroceder entre músicas. 

## **Estrutura do Projeto**

O projeto está organizado da seguinte forma:

```
PlayMusic/
├── assets/                # Arquivos de mídia (áudios e imagens)
│   ├── In-The-End-Linkin-Park.wav
│   ├── Red-Hot-Chili-Peppers-Otherside.wav
│   ├── Red-Hot-Chili-Peppers-Californication.wav
│   └── music.png          # Imagem exibida na interface
├── src/
│   ├── main/              # Código principal do projeto
│   │   └── App.java       # Classe principal
│   └── model/             # Classes do domínio
│       ├── Album.java
│       ├── Artista.java
│       ├── AudioPlayer.java
│       ├── Musica.java
│       └── Playlist.java
├── .gitignore             # Arquivos e diretórios ignorados pelo Git
└── README.md              # Documentação do projeto
```

## **Funcionalidades**

- Reproduzir e pausar músicas.
- Avançar para a próxima música da playlist.
- Voltar para a música anterior da playlist.
- Exibição do nome da música atual na interface gráfica.
- Carregar uma imagem decorativa na interface.

## **Tecnologias Utilizadas**

- Linguagem: Java
- Interface gráfica: Swing

## **Pré-requisitos**

1. [JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Um ambiente de desenvolvimento integrado (IDE) como [VS Code](https://code.visualstudio.com/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## **Como Executar o Projeto**

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/PlayMusic.git
   ```

2. Importe o projeto na sua IDE preferida.

3. Compile e execute o arquivo `App.java`.

4. Certifique-se de que os arquivos de áudio na pasta `assets/` estão no caminho correto. Ajuste os caminhos no código, caso necessário.

## **Exemplo de Interface**

A interface gráfica do PlayMusic exibe o botão de reprodução, avançar, retroceder e o nome da música atual. Uma imagem decorativa também é exibida.

![Interface do PlayMusic](assets/music.png)

## **Contribuições**

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do repositório.
2. Crie uma branch para sua funcionalidade:
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Faça um push para a branch:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.

## **Licença**

Este projeto é licenciado sob a [MIT License](LICENSE).


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/fRzJq7Nv)
