
public class Suits {
enum CardSuit {clubs, diamonds, hearts, spades}
	public static void main(String[] args) {
CardSuit card1, card2;
card1 = CardSuit.clubs;
card2 = CardSuit.hearts;
System.out.println(card1);
System.out.println(card2.name());
System.out.println(card1.ordinal());
System.out.println(card2.ordinal());

	}

}
