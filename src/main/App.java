package main;

import javax.swing.*;

import model.Album;
import model.Artista;
import model.AudioPlayer;
import model.Musica;
import model.Playlist;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout;

public class App {
    public static void main(String[] args) {
        // Arquivos de áudio
        final String AUDIO_IN_THE_END = "assets\\In-The-End-Linkin-Park.wav";
        final String AUDIO_OTHERSIDE = "assets\\Red-Hot-Chili-Peppers-Otherside.wav";
        final String AUDIO_CALIFORNICATION = "assets\\Red-Hot-Chili-Peppers-Californication.wav";

        // Criação da playlist
        Playlist playlist = new Playlist("Minhas músicas");
        playlist.addMusica(new Musica("In The End", "Rock", AUDIO_IN_THE_END, 120));
        playlist.addMusica(new Musica("Otherside", "Rock", AUDIO_OTHERSIDE, 120));
        playlist.addMusica(new Musica("Californication", "Rock", AUDIO_CALIFORNICATION, 120));

        // Criação do álbum e artista
        Album album = new Album("Minhas músicas", 2021, playlist.getMusicas());
        Artista redHot = new Artista("Red Hot Chili Peppers");
        redHot.addAlbum(album);

        // Player
        AudioPlayer player = new AudioPlayer(playlist);

        // GUI
        JFrame frame = new JFrame("PlayMusic");
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Carregar e exibir a imagem
        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("assets/music.png"); // Caminho da imagem
        Image scaledImage = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage)); // Redimensiona a imagem para 100x100 pixels

        // Nome da música
        JLabel musicNameLabel = new JLabel(player.getMusicaAtual().getNome(), JLabel.CENTER);
        musicNameLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Painel superior (imagem + nome da música)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(imageLabel, BorderLayout.WEST); // Adiciona a imagem à esquerda
        topPanel.add(musicNameLabel, BorderLayout.CENTER); // Nome da música no centro

        // Botão play/stop
        JButton playStopButton = new JButton("▶");
        playStopButton.setActionCommand("Play");
        playStopButton.addActionListener(e -> {
            if (!player.isPlaying()) {
                player.playAudio();
                playStopButton.setText("❚❚");
                playStopButton.setActionCommand("Stop");
            } else {
                player.stopAudio();
                playStopButton.setText("▶");
                playStopButton.setActionCommand("Play");
            }
            System.out.println("Botão pressionado: " + e.getActionCommand());
        });

        // Botão próximo
        JButton nextButton = new JButton("⏩");
        nextButton.setActionCommand("Próximo");
        nextButton.addActionListener(e -> {
            System.out.println("Botão pressionado: " + e.getActionCommand());
            player.nextAudio();
            musicNameLabel.setText(player.getMusicaAtual().getNome());
        });

        // Botão anterior
        JButton previousButton = new JButton("⏪");
        previousButton.setActionCommand("Anterior");
        previousButton.addActionListener(e -> {
            System.out.println("Botão pressionado: " + e.getActionCommand());
            player.previousAudio();
            musicNameLabel.setText(player.getMusicaAtual().getNome());
        });

        // Painel de controle
        JPanel controlsPanel = new JPanel(new FlowLayout());
        controlsPanel.add(previousButton);
        controlsPanel.add(playStopButton);
        controlsPanel.add(nextButton);

        // Montagem da interface
        panel.add(topPanel, BorderLayout.NORTH); // Painel com imagem e nome da música
        panel.add(controlsPanel, BorderLayout.SOUTH); // Painel de botões

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
