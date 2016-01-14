import AlgoTools.IO;

public class Chiffre{

	public static void main(String[] argv){

		char[] chiff = new char[26];
		for(int i = 0; i < 26; i++){
			chiff[i] = IO.readChar();
		}
		char[] welt = {'H', 'A', 'L', 'L', 'O', ' ', 'W', 'E', 'L','T'};
		char[] coded = new char[welt.length];

		int letter = 0;
		for(int i = 0; i < welt.length; i++){
			if(welt[i] != ' '){
				letter = (int)welt[i] - 65;
				coded[i] = chiff[letter];
				IO.print(coded[i]);
			}
			else coded[i] = ' ';
		}
		IO.println();
	}
}