package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Backtracking {
	
	private int destX;
	private int destY;
	private int minPathSum = Integer.MAX_VALUE;
	private List<int[]> path;
	
	public Backtracking(int x, int y) {
		this.destX = x;
		this.destY = y;
		path = new LinkedList<int[]>();	
	}
	
	public void backtracking(MapLayout m, int x, int y) {
		int pathValueSum = 0;
		List<int[]> tempPath = new LinkedList<int[]>();
		backtracking(m, x, y, pathValueSum, tempPath);
	}
	
	private void backtracking(MapLayout m, int x, int y, int pathValueSum, List<int[]> tempPath) {
		Tile t = m.accessTile(x, y);
		int[] tileCoords = new int[2];
		tileCoords[0] = x;
		tileCoords[1] = y;
		if (x == destX && y == destY) {
			pathValueSum += t.getValue();
			System.out.println(pathValueSum);
			tempPath.add(tileCoords);
			setPath(tempPath, pathValueSum);
		} else {
			//obtain next moves -- Note: me dio paja armar un arreglo de booleans y despues traducir eso a datos
			// utiles aca asi que pregunto por los proximos movimientos con los if
			if (!t.isVisited()) {
				//Inicio de cambios backtrackeros
				t.setVisited(true);
				pathValueSum += t.getValue();
				tempPath.add(tileCoords);
				
				//Distintos caminos de backtracking
				if (pathValueSum < minPathSum) {
					if (t.pathNorth()) {
						backtracking(m, x, y-1, pathValueSum, tempPath);					
					}
					if (t.pathSouth()) {
						backtracking(m, x, y+1, pathValueSum, tempPath);
					}
					if (t.pathEast()) {
						backtracking(m, x+1, y, pathValueSum, tempPath);
					}
					if (t.pathWest()) {
						backtracking(m, x-1, y, pathValueSum, tempPath);
					}
				}
				//revertir cambios backtraceros
				t.setVisited(false);
				pathValueSum -= t.getValue();
				tempPath.remove(tempPath.size()-1);
			}
			
		}
			
	}
	
	public int getMinPathSum() {
		return minPathSum;
	}
	
	public List<int[]> getPath() {
		return path;
	}

	public void setPath(List<int[]> newPath, int pathValueSum) {
		if (minPathSum > pathValueSum) {
			minPathSum = pathValueSum;
			path = new LinkedList<int[]>();
			path.addAll(newPath);
		}
	}
	
	public void printPath() {
		for (int x = 0; x < path.size(); x++) {
			for (int y = 0; y < path.get(x).length; y++) {
				System.out.print(path.get(x)[y] + " ");
			}
			System.out.print("| ");
			
		}
	}
		
	/* funcion solucion 
	 * Si stoy parado en destino
	 * 	comparar soluciones;
	 * else
	 * 	obtenersiguientesmovimientos
	 * 	iterar
	 * 	mientras haya proximomivimiento
	 * 		si el nodo no esta visitado
	 * 			hacer algo
	 * 			backtrackear
	 * 			deshacer algo
	 * 
	 * */

}
