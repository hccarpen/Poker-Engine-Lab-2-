package lab2;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	ArrayList<Card> cardArray = new ArrayList<Card>();
	
	
	public Deck(boolean a) { //if a == true, shuffles deck
		this.buildDeck();
		if (a)
			this.shuffle();
	}
	
	public Card drawCard() {
		return cardArray.remove(0);
	}
	
	public int remainingCards() {
		return cardArray.size();
	}
	
	private void shuffle() {
		Random rand = new Random();
		int a,
			b;
		Card oldCard;
		
		for (int i = 0; i < 234; i++) {
			a = rand.nextInt(cardArray.size() - 1);
			b = rand.nextInt(cardArray.size() - 1);
			oldCard = cardArray.get(b);
			
			cardArray.set(b, cardArray.get(a));
			cardArray.set(a, oldCard);
			
		}
	}
	
	private void buildDeck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 12; j++) {
				cardArray.add(new Card(j,i));
			}
		}
	}
}