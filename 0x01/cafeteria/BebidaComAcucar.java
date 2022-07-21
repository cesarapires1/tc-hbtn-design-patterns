import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    private Bebida bebidaDecorada;

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public double obterPreco() {
        return 1.9 + this.bebidaDecorada.obterPreco();
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = this.bebidaDecorada.obterIngredientes();
        ingredientes.add("acucar");
        return ingredientes;
    }
}
