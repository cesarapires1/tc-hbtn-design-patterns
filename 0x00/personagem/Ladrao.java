public class Ladrao extends Personagem{
    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super();
        setNome(nome);
        setTipo(TipoPersonagem.LADRAO);
        setVigor(vigor);
        setResistencia(resistencia);
        setInteligencia(inteligencia);
        setForca(forca);
        setDestreza(destreza);
    }

    @Override
    public void setDestreza(int destreza) {
        if (destreza < getInteligencia() || destreza < getForca()) {
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
        super.setDestreza(destreza);
    }

    @Override
    public double getDanoAtaque() {
        return getInteligencia()*0.05 + getForca()*0.5 + getDestreza()*0.35 + getVigor()*0.1;
    }
}
