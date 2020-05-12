package aula20200511.ArraysEListas;

public class AppSistema {
	
	
	public static void main(String[] args) {
	//Criando os Produto
	Produto Mouse = new Produto("Mouse");
	Produto Fone = new Produto("Fone");
	Produto Peendrive = new Produto("Peendrive");
	
	//Criando Item Pedido
	ItemPedido itemMouse = new ItemPedido(Mouse,15,35.00);
	ItemPedido itemFone = new ItemPedido(Fone,5,25.00);
	ItemPedido itemPeendrive = new ItemPedido(Peendrive,10,20.00);

	//Criando a lista de pedidos
	Pedido primeiroPedido = new Pedido(1);
	primeiroPedido.adicionarItem(itemMouse);
	primeiroPedido.adicionarItem(itemFone);
	primeiroPedido.adicionarItem(itemPeendrive);
	
	//Agora irei imprimir os pedidos
	for (int i = 0; i < primeiroPedido.getItens().size(); i++) {
		System.out.println("\n\n======================================================");
		System.out.println("Produto: "+primeiroPedido.getItens().get(i).getProduto().getNome());
		System.out.println("Quantidade: "+primeiroPedido.getItens().get(i).getQuantidade());
		System.out.println("Preço: "+primeiroPedido.getItens().get(i).getPreço());
		System.out.println("======================================================");
	}
	
	
	}
}
