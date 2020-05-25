package paisEEstados;

public class App {
	
	public static void main(String[] args) {
		Pais brasil = new Pais("Brasil",55);
		
		brasil.addEstado(new Estado("Paraná","PR",44));
		brasil.addEstado(new Estado("São Paulo","SP",11));
		brasil.addEstado(new Estado("Rio De Janeiro","RJ",24));
		brasil.addEstado(new Estado("Bahia","BH",75));
		brasil.addEstado(new Estado("Santa Cataria","SC",48));
		
		
		mostrarDados(brasil);
		
	}
	
	public static void mostrarDados(Pais p) {
		System.out.println("PAIS \nNome: "+p.getNome());
		System.out.println("Codigo DDI: "+p.getCodDDI()+"\n");
		System.out.println("ESTADOS");
		for(int i = 0; i < p.contarEstados(); i++) {
		System.out.println("Nome: "+p.getEstados().get(i).getNome());
		System.out.println("Sigla: "+p.getEstados().get(i).getSigla());
		System.out.println("Codigo DDD: "+p.getEstados().get(i).getCodDDD()+"\n");
		}
		
		System.out.println("\nQuantidade de paises: "+p.contarEstados());
	}
	

}
