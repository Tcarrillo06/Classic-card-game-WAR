package week06CodingProject;

// Create a class called App with a main method.

public class App {
	
	 public static void main(String[] args) {
		 
		 
// Instantiate a Deck and two Players, call the shuffle method on the deck
		 
		 Deck deck = new Deck();
	        Player player1 = new Player("1");
	        Player player2 = new Player("2");
	        deck.shuffle();
	        
// Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated. 	        
	        for (int i = 0; i < 52; i++) {
	            if ( i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }
	        
	        int round = 1;
	        
// Using a traditional for loop, iterate 26 times and call the flip method for each player. 	        
		 
	        for (int i = 0; i < 26; i++) {
	        	System.out.println("\n ---- Round " + round + " of 26 ----");
	        	round++;
	         Card player1Card = player1.flip();
	         Card player2Card = player2.flip();
	         
	         System.out.println(" ");
	         
// Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.        
	      // Print a message to say which player received a point.         
	            
	            if (player1Card.getValue() > player2Card.getValue()) {
	                player1.incrementScore(); 
	                System.out.println("Player1 has received a point.");
	            } else if (player1Card.getValue() < player2Card.getValue()) {
	                player2.incrementScore();	                
	                System.out.println("Player2 has received a point.");
	                
// If the values are equal (it is a tie), print a message saying that no point was awarded.	                
	                
	            } else {
	            	System.out.println("No point was awarded");
	            		
	            	}
	            System.out.println(" ");
	            System.out.println( "Current Score : |Player1 - " + player1.setScore() +"| " + " " + " |Player2 - " + player2.setScore()+ "|");
	            
	        }
	        
//Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same. 
	        
	        		System.out.println("");
	        		System.out.println("*-------------FINAL SCORE-------------*");
	        		System.out.println("");
	        
	        		System.out.printf("Player1 score = %d\n", player1.getScore());
	        		System.out.printf("Player2 score = %d\n", player2.getScore());
	        
	        
	        	if (player1.getScore() > player2.getScore()) {
	            	System.out.println("Player1 is the winner!");
	        	} else if (player1.getScore() < player2.getScore()) {
	        		System.out.println("");
	        		System.out.println("Player2 is the winner!");
	        	} else {
	            	System.out.println("It is a DRAW!");
	        }
		  
	 }

}
