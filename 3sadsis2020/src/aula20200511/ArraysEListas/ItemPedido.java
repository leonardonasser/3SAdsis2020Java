package aula20200511.ArraysEListas;

public class ItemPedido {
	
	private double quantidade;
	private double pre�o;
	private Produto produto;
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public double getPre�o() {
		return pre�o;
	}
	 
	public Produto getProduto() {
	return produto;

	}

	public ItemPedido(Produto produto, double quantidade, double pre�o) {
		this.quantidade = quantidade;
		this.pre�o = pre�o;
		this.produto = produto;
		
	}
	
	
	
	
}
