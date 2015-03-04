package lab2;

import java.util.ArrayList;

public class Hand {
	
	public Card[] cards;
	public int totalValue;
	protected int MAX_CARDS = 5;
	
	
	public Hand(Deck x) {
		this.cards = new Card[MAX_CARDS];
		this.totalValue = 0;
		for (int i = 0; i < MAX_CARDS; i++) {
			this.cards[i] = x.drawCard();
			this.totalValue += cards[i].rank;
		}
	}
	
	public Hand judgeHands(Hand a) {
		if (this.totalValue > a.totalValue)
			return this;
		return a;
	}
	
	public static Hand judgeHands(Hand[] a) {
		ArrayList<Hand> hands = new ArrayList<Hand>();
		hands.add(a[0]);
		for (int i = 0; i < a.length; i++) {
			if (a[i].totalValue > hands.get(0).totalValue) {
				hands.add(0, a[i]);
			} else {
				hands.add(hands.size() - 1, a[i]);
			}
		}
		return hands.get(0);
	}
	
}