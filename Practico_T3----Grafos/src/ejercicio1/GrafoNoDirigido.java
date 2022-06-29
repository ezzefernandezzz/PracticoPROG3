package ejercicio1;

public class GrafoNoDirigido extends GrafoDirigido {

	@Override
	public void relacion(int vertice, int arista) {
		// TODO Auto-generated method stub
		super.relacion(vertice, arista);
		super.relacion(arista, vertice);
	}

	
}
