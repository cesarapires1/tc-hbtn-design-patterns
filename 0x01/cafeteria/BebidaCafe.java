import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{
    @Override
    public double obterPreco() {
        return 5.35;
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("cafe");
        return ingredientes;
    }
}
