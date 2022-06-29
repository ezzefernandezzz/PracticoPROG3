package ejercicio1;

public class Vertice extends ModeloNodo{
	private ModeloNodo listaAristas;
	
	public Vertice(int dato) {
		super(dato);
		listaAristas = null;
	}
	
	public void addArista(int valorArista) {
		if (listaAristas == null)
			listaAristas = new ModeloNodo(valorArista);
		else
			add(listaAristas, valorArista);
	}
	public void add(ModeloNodo arista, int valor) {
		if(arista.getDato() != valor) { //Para no aceptar valores de aristas repetidos
			if(arista.getSiguiente() != null) {
				add(arista.getSiguiente(), valor);
			}
			else {
				ModeloNodo temp = new ModeloNodo(valor);
				arista.setSiguiente(temp);
			}			
		}
	}
	
	@Override
	public void imprimir() {
		System.out.println("Vertice: " + this.getDato() + " aristas: ");
		printAristas(listaAristas);
	}
	
	public void printAristas(ModeloNodo arista) {
		if(arista != null) {
			System.out.println(arista.getDato());
			printAristas(arista.getSiguiente());
		}
	}
	
	
}
