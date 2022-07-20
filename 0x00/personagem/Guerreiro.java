public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super();
        setNome(nome);
        setTipo(TipoPersonagem.GUERREIRO);
        setVigor(vigor);
        setResistencia(resistencia);
        setDestreza(destreza);
        setInteligencia(inteligencia);
        setForca(forca);
    }

    @Override
    public void setForca(int forca) {
        if (forca < getInteligencia() || forca < getDestreza()) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
        super.setForca(forca);
    }

    @Override
    public double getDanoAtaque() {
        return getInteligencia()*0.5 + getForca()*0.8 + getDestreza()*0.1 + getVigor()*0.5;
    }
}
