
public class Card {
	//Private member variables
	private final String face;
	private final String suit;
	
	// Constructor
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	// toString()
	public String toString() {
		return face + " of " + suit;
	}
}
