package ejercicio2;

public class MapLayout {
	
	private Tile[][] layout;
	
	public MapLayout(int sizeX, int sizeY) {
		layout = new Tile[sizeX][sizeY];	//tablero = arreglo de piezas de X.Y
	}
	
	public Tile accessTile(int x, int y) {
		return layout[x][y];				//retorno la pieza de la pos x,y
	}
	
	public void placeTileAtPos(int x, int y, Tile t) {
		layout[x][y] = t;					//asigno la posicion x-y del tablero a T
	}

	public void printMap() {
		System.out.println();
		for(int y = 0; y < layout.length; y++) {
			for (int x = 0; x < layout.length; x++) {
				System.out.print("  " + accessTile(x,y).getValue());
				if (accessTile(x,y).getValue() < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}	

}
