import AlgoTools.IO;
public class VierGewinnt {
	public static void main(String[] argv) {
		int breite = IO.readInt();
		int hoehe = IO.readInt();
		char[][] spielFeld = new char[breite][hoehe];
		for(int i = 0; i < hoehe; i++) {
			for(int j = 0; j < breite; j++) {
				spielFeld[i][j] = IO.readChar();
			}
		}
		for(int i = 0; i < hoehe; i++) {
			for(int j = 0; j < breite; j++) {
				if(hatGewonnen(spielFeld, i, j, 'R')) {
					IO.println("R");
					return;
				} else if(hatGewonnen(spielFeld, i, j, 'Y')) {
					IO.println("Y");
					return;
				}
			}
		}
		IO.println("D");
	}
	public static boolean hatGewonnen(char[][] s, int x, int y, char f) {
		if(s[x][y] == '-') {
			return false;
		}
		int i;
		for(i = 0; i < 4; i++) {
			if(farbe(s, x + i, y) != f) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		for(i = 0; i < 4; i++) {
			if(farbe(s, x, y + i) != f) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}

		for(i = 0; i < 4; i++) {
			if(farbe(s, x + i, y + i) != f) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		for(i = 0; i < 4; i++) {
			if(farbe(s, x - i, y - i) != f) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		return false;
	}
	public static char farbe(char[][] s, int x, int y) {
		if(x > s.length || y > s[x].length || x < 0 || y < 0) {
			return '-';
		}
		return s[x][y];
	}
}