package ejercicio2;

public class Tile {

	/* A tile is a piece which has a value and four possible directions, north, south, west and east
	   A true value means it's possible to move in that direction, meanwhile a false value represents a wall
	   Tiles belong in maps, which is a 2d array (or matrix) */
	
	private int value;
	private boolean visited;
	private boolean north;
	private boolean south;
	private boolean east;
	private boolean west;
	
	public Tile (int value, boolean north, boolean south, boolean east, boolean west) {
		this.value = value;
		this.visited = false;
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	}

	public int getValue() {
		return value;
	}
	
	public boolean[] getMovesArray() {
		boolean[] movArr = new boolean[4];
		movArr[0] = pathNorth();
		movArr[1] = pathSouth();
		movArr[2] = pathEast();
		movArr[3] = pathWest();
		return movArr;
	}
	
	public boolean hasMove() {
		return north || south || east || west;
	}
	
	public boolean pathNorth() {
		return north;
	}

	public boolean pathSouth() {
		return south;
	}

	public boolean pathEast() {
		return east;
	}

	public boolean pathWest() {
		return west;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	
	
}
