package game;

import java.util.ArrayList;

import game.enums.PieceType;

public class Player {

	int points;
	String name;
	ArrayList<Resource> resources;
	ArrayList<DevelopmentCard> developmentCards;
	ArrayList<Piece> pieces;
	ArrayList<Port> ports;
	
	public Player(String name) {
		
		this.points = 0;
		this.name = name;
		this.resources = new ArrayList<Resource>();
		this.developmentCards = new ArrayList<DevelopmentCard>();
		this.pieces = new ArrayList<Piece>();
		this.ports = new ArrayList<Port>();
		
		instantiatePieces();
	}
	
	private void instantiatePieces() {
		
		for(int i = 0; i < 15; i++) {
			
			this.pieces.add(new Piece(this, PieceType.Road));
			
			if(i < 5) {
				
				this.pieces.add(new Piece(this, PieceType.Settlement));
				
				if(i < 4) {
					
					this.pieces.add(new Piece(this, PieceType.City));
				}
			}
		}
	}
}
