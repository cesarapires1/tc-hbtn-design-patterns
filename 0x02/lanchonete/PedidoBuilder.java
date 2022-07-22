public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido =  new Pedido();

    public Pedido build(){
        return this.pedido;
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.LANCHE, tipo.toString());
        this.pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.BATATA, tamanho.toString());
        this.pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.BRINDE, tipo.toString());
        this.pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.BEBIDA, tipo.toString());
        this.pedido.adicionarItemForaCaixa(itemPedido);
    }
}
