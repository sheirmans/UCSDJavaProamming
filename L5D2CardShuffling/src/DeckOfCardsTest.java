
public class DeckOfCardsTest {

	public static void main(String[] args) {
		System.out.println("Deck of Cards Test");
		DeckOfCards myDeckOfCards; //Reference
		myDeckOfCards = new DeckOfCards(); //Create an instance
		System.out.println("Cards before shuffle");
		System.out.println(myDeckOfCards);
		
		//Shuffle the cards
		myDeckOfCards.shuffle();
		System.out.println("Card after suffle");
		System.out.println(myDeckOfCards);
		
		//Print all 52 cards in order they are dealt
		for (int i = 1; i < 52; i++ ) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			//Output a new line every 4th card
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
		// Another way to handle all the cards
		System.out.println();
		System.out.println("Another way to deal all cards");
		myDeckOfCards.shuffle();
		Card card = myDeckOfCards.dealCard();
		while (card != null) {       //keep doing unless we have no more cards
			System.out.printf("%-19s%n", card);
			card = myDeckOfCards.dealCard();
		}
		
		//Yet another way
		System.out.println("yet another way");
		myDeckOfCards.shuffle();
		card = myDeckOfCards.dealCard();
		do {
			System.out.printf("%-19s%n", card);
			card = myDeckOfCards.dealCard();
		} while (card != null);
		
		
		//And one more way
		System.out.println("And one more way");
		myDeckOfCards.shuffle();
		while (true) {
			card = myDeckOfCards.dealCard();
			if(card == null) break;
			System.out.printf("%-19s%n", card);
			card = myDeckOfCards.dealCard();
		}
		System.out.println("All done");
	}

}
