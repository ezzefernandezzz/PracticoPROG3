package ejercicio1;

public class main {

	public static void main(String[] args) {
		/*GrafoDirigido gd = new GrafoDirigido();
		gd.relacion(1, 5);
		gd.relacion(2, 5);
		gd.relacion(2, 5);
		gd.relacion(1, 7);
		gd.relacion(9, 7);
		gd.relacion(2, 55);
		gd.imprimirGrafo();*/
		
		GrafoNoDirigido gnd = new GrafoNoDirigido();
		gnd.relacion(5, 7);
		gnd.relacion(5, 6);
		gnd.imprimirGrafo();

	}

}
