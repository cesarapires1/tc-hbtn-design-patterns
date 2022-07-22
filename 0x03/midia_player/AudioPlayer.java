public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        System.out.print("Reproduzindo VLC: " + nome);
    }
}
