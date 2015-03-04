package lab2;

public class Card {
	
	public int rank;
	public int suit;
	
	private static String[] ranks = {
		"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
	};
	
	private static String[] suits = {
		"hearts", "spades", "diamonds", "clubs"
	};
	
	private static String getRank(int x) {
		if (x > ranks.length || x < 0)
			return "[unknown rank]";
		else
			return ranks[x];
	}
	
	private static String getSuit(int x) {
		if (x > suits.length || x < 0)
			return "[unknown suit]";
		else
			return suits[x];
	}
	
	@Override
	public String toString() {
		return getRank(rank) + " of " + getSuit(suit);
	}
	
	public Card(int n, int x) {
		this.rank = n;
		this.suit = x;
	}
	
}
