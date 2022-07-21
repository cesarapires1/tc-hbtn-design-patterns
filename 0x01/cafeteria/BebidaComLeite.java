import java.util.List;

public class BebidaComLeite extends BebidaDecorator{
    private Bebida bebidaDecorada;

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public double obterPreco() {
        return 3.2 + this.bebidaDecorada.obterPreco();
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = this.bebidaDecorada.obterIngredientes();
        ingredientes.add("leite");
        return ingredientes;
    }
}
