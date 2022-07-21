import java.util.List;

public class BebidaDecorator extends Bebida{
    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco();
    }

    @Override
    public List<String> obterIngredientes() {
        return super.obterIngredientes();
    }
}
