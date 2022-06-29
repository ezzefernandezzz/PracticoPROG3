package ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Backtracking_mio {
	private int sumaMinima = Integer.MAX_VALUE;
	private List<int[]> listaRecorrido_f;
	private int x_piezaF, y_piezaF;	//Dejo asignado un casillero de inicio
	
	
	
	public Backtracking_mio(int x_piezaF, int y_piezaF) {
		super();
		this.listaRecorrido_f = new LinkedList<int[]>();
		this.x_piezaF = x_piezaF;
		this.y_piezaF = y_piezaF;
	}

	//private void recorridoMinimo(MapLayout tablero, Tile piezaI, Tile piezaF) {
	public void recorridoMinimo(MapLayout tablero, int x_piezaI, int y_piezaI) {
		List<int[]> listaRecorrido_parcial = new LinkedList<>();
		int sumaParcial = 0;
		
		backtracking(tablero, x_piezaI, y_piezaI, sumaParcial, listaRecorrido_parcial);
		// paso los parametros de a donde quiero llegar, y la lista parcial
		
		//System.out.println(listaRecorrido_parcial);
	}
	
	public void backtracking(MapLayout tablero, int pActual_x, int pActual_y, int suma_parcial, List<int[]> recorridoParcial) {
		Tile t = tablero.accessTile(pActual_x, pActual_y);
		int[] cordenadasPieza = new int[2];
		cordenadasPieza[0] = pActual_x;
		cordenadasPieza[1] = pActual_y;
		
		if(pActual_x == x_piezaF && pActual_y == y_piezaF) {
			suma_parcial += t.getValue();
			System.out.println("Suma parcial: " + suma_parcial);
			recorridoParcial.add(cordenadasPieza);
			actualizarPath(suma_parcial, recorridoParcial);
			recorridoParcial.remove(cordenadasPieza);
		}
		else {
			//System.out.println(t.getValue());
			if(!t.isVisited()) {
				////CAMBIOS
				t.setVisited(true);
				//recorridoParcial.add(cordenadasPieza);
				suma_parcial += t.getValue();
				
				if(suma_parcial < sumaMinima) {
					if (t.pathNorth()) {
							backtracking(tablero, pActual_x, pActual_y - 1, suma_parcial, recorridoParcial);
					}
					if(t.pathSouth()) {
							backtracking(tablero, pActual_x, pActual_y + 1, suma_parcial, recorridoParcial);
					}
					if(t.pathWest()) {
							backtracking(tablero, pActual_x - 1, pActual_y, suma_parcial, recorridoParcial);				
					}
					if(t.pathEast()) {
							backtracking(tablero, pActual_x + 1, pActual_y, suma_parcial, recorridoParcial);
					}
				}
				t.setVisited(false);
				//recorridoParcial.remove(recorridoParcial.size()-1);
				recorridoParcial.remove(cordenadasPieza);
				suma_parcial -= t.getValue();
			}		
		}
	}
	
	public void actualizarPath(int suma, List<int[]> recorrido) {
		if(sumaMinima > suma) {
			sumaMinima = suma;
			listaRecorrido_f = new LinkedList<int []>();
			listaRecorrido_f.addAll(recorrido);
		}
	}

	public List<int[]> getListaRecorrido_f() {
		return listaRecorrido_f;
	}
}
