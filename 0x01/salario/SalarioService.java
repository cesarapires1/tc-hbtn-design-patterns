public class SalarioService {
    private CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadorSalarioService();

    public double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao) {
        return calculador.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas,percentualComissao);
    }

    public String getUuid() {
        return String.format("" + calculador.getUuid());
    }
}
