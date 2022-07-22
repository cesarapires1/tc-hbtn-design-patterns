public class NaveEspacialDecorator extends NaveEspacial{
    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        setNaveEspacial(naveEspacial);
    }

    public NaveEspacial getNaveEspacial() {
        return naveDecorada;
    }

    public void setNaveEspacial(NaveEspacial naveEspacial) {
        this.naveDecorada = naveEspacial;
    }

    @Override
    public int getSaude() {
        return super.getSaude();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }
}
