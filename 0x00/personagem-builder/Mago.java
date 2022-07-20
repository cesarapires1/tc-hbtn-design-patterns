public class Mago extends Personagem{

    public Mago(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super();
        setNome(nome);
        setTipo(TipoPersonagem.MAGO);
        setForca(forca);
        setVigor(vigor);
        setResistencia(resistencia);
        setDestreza(destreza);
        setInteligencia(inteligencia);
    }

    @Override
    public void setInteligencia(int inteligencia) {
        if (inteligencia < getDestreza() || inteligencia < getForca()) {
            throw new IllegalArgumentException("Atributos invalidos para MAGO");
        }
        super.setInteligencia(inteligencia);
    }

    @Override
    public double getDanoAtaque() {
        return getInteligencia()*0.8 + getForca()*0.05 + getDestreza()*0.05 + getVigor()*0.1;
    }
}
