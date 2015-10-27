package game;

import game.enums.PieceType;

public class Piece {
	
	PieceType type;
	Player player;
	
	public Piece(Player player, PieceType type) {
		
		this.player = player;
		this.type = type;
	}
}
