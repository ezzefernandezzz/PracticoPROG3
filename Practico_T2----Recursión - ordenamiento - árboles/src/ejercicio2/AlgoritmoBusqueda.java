package ejercicio2;

public class AlgoritmoBusqueda {
	
	public AlgoritmoBusqueda() {
	// TODO Auto-generated constructor stub
	}
	
	public boolean existe(Lista<Integer> l, Integer buscado, int index) {
		boolean encontro = false;
		if(l.get(index).getInfo() != buscado && index < l.size() && !encontro)
			encontro = existe(l, buscado, index+1);
		
		if(l.get(index).getInfo() == buscado)
			System.out.println(l.get(index).getInfo() + " / " + buscado);
			encontro = true;
		return encontro;
	}
}
