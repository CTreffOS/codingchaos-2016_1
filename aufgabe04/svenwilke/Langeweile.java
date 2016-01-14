import AlgoTools.IO;

public class Langeweile {
	
	public static class Card {
		public boolean used = false;
		private int color;
		private int number;
		public Card(int c, int n) {
			this.color = c;
			this.number = n;
		}
		public boolean isPlayable(Card c) {
			return c.color == this.color || c.number == this.number;
		}
		public String toString() {
			return "(" + color + ", " + number + ")";
		}
	}
	
	public static void main(String[] args) {
		int amount = IO.readInt();
		Card[] cards = new Card[amount];
		for(int i = 0; i < cards.length; i++) {
			cards[i] = readCard();
		}
		int[] folge = new int[amount];
		boolean loesung = hatLoesung(cards, folge, 0);
		if(loesung) {
			IO.println("Lösung gefunden:");
			for(int i = 0; i < folge.length; i++) {
				IO.println(cards[folge[i]]);
			}
		} else {
			IO.println("Keine Lösung gefunden.");
		}
	}
	
	private static boolean hatLoesung(Card[] cards, int[] folge, int pos) {
		if(pos >= folge.length) {
			return true;
		}
		for(int i = 0; i < cards.length; i++) {
			if(!cards[i].used && (pos == 0
									|| cards[folge[pos - 1]].isPlayable(cards[i]))) {
				folge[pos] = i;
				cards[i].used = true;
				if(hatLoesung(cards, folge, pos + 1)) {
					return true;
				} else {
					cards[i].used = false;
				}
			}
			
		}
		return false;
	}
	
	private static Card readCard() {
		String s = IO.readLine();
		String[] spl = s.split(" ");
		return new Card(Integer.parseInt(spl[0]), Integer.parseInt(spl[1]));
	}
}