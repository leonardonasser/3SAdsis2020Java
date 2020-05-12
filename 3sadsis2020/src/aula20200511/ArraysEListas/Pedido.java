package aula20200511.ArraysEListas;

import java.util.ArrayList;

public class Pedido {

	private int numero;
	private ArrayList<ItemPedido> itensPedidoLista = new ArrayList<ItemPedido>();
	
	
	public int getNumero() {
		return numero;
	}
	
	public Pedido(int numero) {
		this.numero = numero;
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
		this.itensPedidoLista.add(itemPedido);
	}
	
	public ArrayList<ItemPedido> getItens() {
		return itensPedidoLista;
	}
	
	
}
