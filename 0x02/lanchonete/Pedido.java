import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<ItemPedido>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<ItemPedido>();

    public Pedido() {
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public void setItensDentroCaixa(HashSet<ItemPedido> itensDentroCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void setItensForaCaixa(HashSet<ItemPedido> itensForaCaixa) {
        this.itensForaCaixa = itensForaCaixa;
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String textoPedido =  "Fora da caixa: \n";
        for (ItemPedido item : itensForaCaixa ) {
            textoPedido += "        - " + item.getTipo() + " " + item.getNome() + "\n";
        }
        textoPedido += "Dentro da caixa: \n";
        for (ItemPedido item : itensDentroCaixa ) {
            textoPedido += "        - " + item.getTipo() + " " + item.getNome()+ "\n";
        }
        return textoPedido;
    }
}
