package aula20200511.ArraysEListas;

public class ItemPedido {
	
	private double quantidade;
	private double preço;
	private Produto produto;
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public double getPreço() {
		return preço;
	}
	 
	public Produto getProduto() {
	return produto;

	}

	public ItemPedido(Produto produto, double quantidade, double preço) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;
		
	}
	
	
	
	
}
