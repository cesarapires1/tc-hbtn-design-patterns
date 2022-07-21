import java.util.ArrayList;
import java.util.List;

public class BebidaDecorator extends Bebida{
    private double preco;
    private List<String> ingredientes = new ArrayList<>();
    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public double obterPreco() {
        return this.preco;
    }

    @Override
    public List<String> obterIngredientes() {
        return this.ingredientes;
    }
}
