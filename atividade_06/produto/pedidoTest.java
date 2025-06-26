package produto;
public class pedidoTest{
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 25.00);
        Produto produto2 = new Produto("Calça Jeans", 89.90);
        Produto produto3 = new Produto("Tênis", 120.50);

        Pedido pedido1 = new Pedido(produto1, 2);
        Pedido pedido2 = new Pedido(produto2, 1);
        Pedido pedido3 = new Pedido(produto3, 3);

        System.out.println("Informações dos Pedidos:");
        pedido1.exibirInformacoes();
        pedido2.exibirInformacoes();
        pedido3.exibirInformacoes();
    }
}