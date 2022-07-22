public class NaveEspacialDecorator extends NaveEspacial{
    private NaveEspacial naveEspacial;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        setNaveEspacial(naveEspacial);
    }

    public NaveEspacial getNaveEspacial() {
        return naveEspacial;
    }

    public void setNaveEspacial(NaveEspacial naveEspacial) {
        this.naveEspacial = naveEspacial;
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
