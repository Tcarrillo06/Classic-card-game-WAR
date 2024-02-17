package week06CodingProject;

//Create Classes with fields and methods

import java.util.ArrayList;
import java.util.List;

public class Player {
	
// Created fields for 
// list( list of cards)
// score ( set to 0 )
// name ( player1 and player2)	

	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	
	
	public Player() {
        score = 0;
    }

    public Player(String newName) {
        name = newName;
        score = 0;
    }
    
   
  // describe (prints out information about the player and calls the describe method for each card in the Hand List) 

    public void describe() {
        System.out.printf("Player %s has the following cards: \n", name);
        for (Card card : hand) {
            card.describe();
        }
    }
    
 //  flip (removes and returns the top card of the Hand)   

    public Card flip() {
        return hand.remove(0);
    }

 //  draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field) 
    
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

 // incrementScore (adds 1 to the Player’s score field)  
    
    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
	
	public int setScore() {
		return score;
	}
	
	
	
	
	
}
