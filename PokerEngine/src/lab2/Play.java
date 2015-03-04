package lab2;

public class Play {

	public static void main(String[] args) {
		Deck deck = new Deck(true);
		Hand hand1 = new Hand(deck);
		Hand hand2 = new Hand(deck);
		
		hand1.judgeHands(hand2);
		
		Hand.judgeHands(new Hand[] {hand1, hand2});
	}
	
}
