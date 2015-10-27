package game;

import game.enums.TileType;

public class Tile {

	TileType type;
	int value;
	
	public Tile(TileType type, int value) {
		
		this.type = type;
		this.value = value;
	}
}
