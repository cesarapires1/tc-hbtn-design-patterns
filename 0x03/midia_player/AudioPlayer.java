public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        MediaPlayerAdapter mediaPlayerAdapter;

        if (tipoMedia.equals(TipoMedia.MP3)) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {
            mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
            mediaPlayerAdapter.reproduzir(tipoMedia, nome);
        }
    }
}
