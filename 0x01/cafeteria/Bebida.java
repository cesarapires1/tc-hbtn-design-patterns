import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {
    private double preco;
    private List<String> ingredientes = new ArrayList<>();

    abstract double obterPreco();

    abstract List<String> obterIngredientes();

    @Override
    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
    }




}
