/**
 * 
 */
package week5;

/**
 * 
 */


			
public class Card {			
	String name;			
	String suit;		
	int value;

	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit (String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		
	
	}
	
			


			
				
				// Call the describe method on the newly instantiated card.
				public void describe() {
					System.out.println(this.name + " of " + this.suit + ": " + this.value);
					
}

				public void introduce() {
					// TODO Auto-generated method stub
					System.out.println("Card name: " + name);
					System.out.println("Card suit: " + suit);
					System.out.println("Card value: " + value);	

				}
				}

				
				

				// 2. Deck Class:
				//		Create a class called Deck.
				//		Fields:  This class should have a list of Card field called cards 
				//				 that will hold all the cards in the deck. 
				//			List<Card> cards = new ArrayList<Card>(); 
				//
				//		Constructor: The constructor for the Deck Class should
				// 			instantiate all 52 standard playing cards and add them to the cards list.
				//
				//		Methods:  
				//			a.  describe() to describe the deck to the Console -- 
				//					print out all of the cards in the deck.
//				//
//				System.out.println("\nQuestion 2: Deck Class");
//			    // Add your code here to instantiate a Deck	
//			    public class Deck{
//			    	public Deck() {}
//			    	
//			    	List<Card> cards = new ArrayList <Card>;
//			    
//			    }
//			    
//			    // Call the describe method on the newly instantiated deck.
//			    
//			    
//			    
//			    
//				
//				
//				// 3. Deck shuffle() Method:
//				//		Add a shuffle method within the Deck Class
//				System.out.println("\nQuestion 3: Deck shuffle() method");
//				// Test your method here
//				
//				
//				
//				// Call the describe method on the newly shuffled deck.
//
//				
//				
//				
//				// 4. Deck draw() Method:
//				//		Add a draw method within the Deck Class
//				System.out.println("\nQuestion 4: Deck draw() method");
//				// Test your method here
//				
//				
//				
//				
				
				
				
				
				// 5. Create Game Board:
				//		Create and test a method that takes an int as a parameter (representing the
//				// 			number of players for a game) and returns a Map<String, List<Card>>
//				// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
//				//			and their cards.
//				//
//				// 			The method should create a new instance of Deck, shuffle it,
//				// 			and deal the cards out to the "players" in the Map.
//				System.out.println("\nQuestion 5: Create Game");
//				// Call your method here
//}
//}
//
//			
//			
//			// Method 5:



