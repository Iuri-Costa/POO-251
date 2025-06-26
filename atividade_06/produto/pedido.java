package produto;
class Pedido {
    public Produto produto;
    public int quantidade;
    public double valorTotal;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = calcularValorTotal();
    }

    public double calcularValorTotal() {
        return produto.preco * quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + produto.nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: "+ produto.preco);
        System.out.println("Valor total: R$ "+ valorTotal);
        System.out.println("--------------------");
    }
}