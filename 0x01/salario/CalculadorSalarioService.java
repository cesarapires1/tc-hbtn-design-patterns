import java.util.UUID;

public class CalculadorSalarioService {
    private static CalculadorSalarioService instance;
    public UUID uuid = UUID.randomUUID();

    private CalculadorSalarioService() {

    }

    public static CalculadorSalarioService getCalculadorSalarioService() {
        if (instance == null) {
            instance = new CalculadorSalarioService();
        }
        return instance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao/100));
    }
}
