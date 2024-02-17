package week06CodingProject;

//Create Classes with fields and methods


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class Deck {

///Create Field (cards: Contains the list of cards)	
	
	List<Card> cards = new ArrayList<Card>();
	List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	
	
		Deck() {
		
		for(int i = 2; i< 15; i++) {
			
			for(String suit: suits) {
				cards.add(new Card(i, suit));
				
			}
			
		}
		
	
	}
		
		public void describe() {
			for (Card card : this.cards) {
				card.describe();
			}
		}
		
	
// Method shuffle which will put the order of the cards at random
	
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
// Method draw which will remove and return the top card of the Cards field	
	
	public Card draw() {
		return cards.remove(0);
		
		
		
	}
	
	
	
}
