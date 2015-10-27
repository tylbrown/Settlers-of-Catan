package game;

import java.util.ArrayList;

import game.enums.DevelopmentCardType;

public class Board {

	ArrayList<Vertex> vertices;
	ArrayList<Edge> edges;
	ArrayList<Tile> tiles;
	ArrayList<DevelopmentCard> deck;
	
	public Board() {
		
		this.setupDeck();
	}
	
	private void setupDeck() {
		
		for(int i = 0; i < 15; i++) { // 15 knights
			
			this.deck.add(new DevelopmentCard(DevelopmentCardType.Knight));
			
			if(i < 5) { // 5 victory points
				
				this.deck.add(new DevelopmentCard(DevelopmentCardType.VictoryPoint));
				
				if(i < 2) { // 2 of each progress cards

					this.deck.add(new DevelopmentCard(DevelopmentCardType.Monopoly));
					this.deck.add(new DevelopmentCard(DevelopmentCardType.RoadBuilding));
					this.deck.add(new DevelopmentCard(DevelopmentCardType.YearOfPlenty));
				}
			}
		}
		
	}
}
