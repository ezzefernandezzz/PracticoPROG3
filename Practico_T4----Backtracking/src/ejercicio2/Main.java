package ejercicio2;

public class Main {

	public static void main(String[] args) {
		MapLayout m = new MapLayout(4,4);
							// NORTH  SOUTH  EAST  WEST
							//  UP    DOWN   RIGHT LEFT
		Tile t1 = new Tile(10, false, true, false, false);
		Tile t2 = new Tile(7, false, true, true, false);
		Tile t3 = new Tile(9, false, true, true, true);
		Tile t4 = new Tile(2, false, true, false, true);
		Tile t5 = new Tile(12, true, false, true, false);
		Tile t6 = new Tile(5, true, false, false, true);
		Tile t7 = new Tile(11, true, true, false, false);
		Tile t8 = new Tile(4, true, true, false, false);
		Tile t9 = new Tile(2, false, true, true, false);
		Tile t10 = new Tile(7, false, false, true, true);
		Tile t11 = new Tile(8, true, true, true, true);
		Tile t12 = new Tile(3, true, true, false, true);
		Tile t13 = new Tile(1, true, false, false, false);
		Tile t14 = new Tile(13, false, false, true, false);
		Tile t15 = new Tile(6, true, false, false, true);
		Tile t16 = new Tile(14, true, false, false, false);
		
		m.placeTileAtPos(0, 0, t1); m.placeTileAtPos(1, 0, t2); m.placeTileAtPos(2, 0, t3); m.placeTileAtPos(3, 0, t4);
		m.placeTileAtPos(0, 1, t5); m.placeTileAtPos(1, 1, t6); m.placeTileAtPos(2, 1, t7); m.placeTileAtPos(3, 1, t8);
		m.placeTileAtPos(0, 2, t9); m.placeTileAtPos(1, 2, t10); m.placeTileAtPos(2, 2, t11); m.placeTileAtPos(3, 2, t12);
		m.placeTileAtPos(0, 3, t13); m.placeTileAtPos(1, 3, t14); m.placeTileAtPos(2, 3, t15); m.placeTileAtPos(3, 3, t16);
		
		m.printMap();
		
		int[] pair = new int[2];
		pair[0] = 2;
		pair[1] = 3;
		
		
		//////////////////////////			Backtracking b = new Backtracking(0,3);
		//////////////////////////			b.backtracking(m, 0, 0);
		//System.out.println(b.getMinPathSum());
		///////////////////							b.printPath();
		
		Backtracking_mio b1 = new Backtracking_mio(0, 3);
		b1.recorridoMinimo(m, 0, 0);
		
		System.out.println();
		/*for (int x = 0; x < b1.getListaRecorrido_f().size(); x++) {
			int xCoord = b1.getListaRecorrido_f().get(x)[0];
			int yCoord = b1.getListaRecorrido_f().get(x)[1];
			System.out.print(m.accessTile(xCoord, yCoord).getValue() + "  |  ");
		}*/
		
		for (int[] cord : b1.getListaRecorrido_f()) {
			System.out.print(m.accessTile(cord[0], cord[1]).getValue() + "  |  ");
		}
	}

}
