public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        System.out.print("Reproduzindo MP3: " + nome);
    }
}
