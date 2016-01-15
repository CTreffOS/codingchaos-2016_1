import AlgoTools.IO;

public class Win {

	public static void main(String[] args) {
		int w = IO.readInt();
		int h = IO.readInt();
		char[][] feld = new char[w][h];
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				feld[i][j] = IO.readChar();
			}
		}
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				if(checkWin(feld, i, j)) {
					IO.println(feld[i][j] + " hat gewonnen!");
					return;
				}
			}
		}
		IO.println("Unentschieden!");
	}

	public static boolean checkWin(char[][] f, int x, int y) {
		if(f[x][y] == '-') {
			return false;
		}
		char c = f[x][y];
		// rechts
		int i;
		for(i = 1; i < 4; i++) {
			if(getChar(f, x + i, y) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// links
		for(i = 1; i < 4; i++) {
			if(getChar(f, x - i, y) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// hoch
		for(i = 1; i < 4; i++) {
			if(getChar(f, x, y - i) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// runter
		for(i = 1; i < 4; i++) {
			if(getChar(f, x, y + i) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// dig links hoch
		for(i = 1; i < 4; i++) {
			if(getChar(f, x - i, y - i) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// dig links unten
		for(i = 1; i < 4; i++) {
			if(getChar(f, x - i, y + i) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// dig rechts hoch
		for(i = 1; i < 4; i++) {
			if(getChar(f, x + 1, y - i) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		// dig rechts unten
		for(i = 1; i < 4; i++) {
			if(getChar(f, x + 1, y + i) != c) {
				break;
			}
		}
		if(i == 4) {
			return true;
		}
		return false;
	}

	public static char getChar(char[][] f, int x, int y) {
		if(x < 0 || x >= f.length || y < 0 || y >= f[0].length) {
			return '-';
		}
		return f[x][y];
	}
}