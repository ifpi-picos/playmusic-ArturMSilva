package model;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioPlayer {
    private final Playlist playlist;
    private Clip audioClip;
    private boolean isPlaying;
    private int currentTrackIndex;

    public AudioPlayer(Playlist playlist) {
        this.playlist = playlist;
        this.currentTrackIndex = 0;
        loadAudio(getMusicaAtual().getArquivoAudio());
    }

    public void loadAudio(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            System.out.println("Erro ao carregar áudio: " + e.getMessage());
        }
    }

    public void playAudio() {
        if (audioClip != null && !isPlaying) {
            audioClip.setFramePosition(0);
            audioClip.start();
            isPlaying = true;
        }
    }

    public void stopAudio() {
        if (audioClip != null && isPlaying) {
            audioClip.stop();
            isPlaying = false;
        }
    }

    public void nextAudio() {
        stopAudio();
        currentTrackIndex = (currentTrackIndex + 1) % playlist.tamanho();
        loadAudio(getMusicaAtual().getArquivoAudio());
        playAudio();
    }

    public void previousAudio() {
        stopAudio();
        currentTrackIndex = (currentTrackIndex - 1 + playlist.tamanho()) % playlist.tamanho();
        loadAudio(getMusicaAtual().getArquivoAudio());
        playAudio();
    }

    public Musica getMusicaAtual() {
        return playlist.getMusica(currentTrackIndex);
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
