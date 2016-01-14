
import AlgoTools.IO;

public class TextChiffrierung {
	public static void main(String[] argv) {
		char[] text = "HALLO WELT".toCharArray();
		char[] chiffAlphabet = IO.readChars();
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for(int i = 0; i < text.length; i++) {
			int j = 0;
			if(text[i] == 32) {
				IO.print(" ");
			}
			while(text[i] != alphabet[j] && j < 25){
				j++;
			}
			if(text[i] == alphabet[j]) {
				text[i] = chiffAlphabet[j];
				IO.print(text[i]);
			}	
		} 
	}
}