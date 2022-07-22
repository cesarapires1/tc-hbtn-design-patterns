public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        System.out.println("Reproduzindo MP3: " + nome);
    }
}
