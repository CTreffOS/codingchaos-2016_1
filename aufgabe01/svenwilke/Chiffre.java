import AlgoTools.IO;

public class Chiffre{

	public static void main(String[] args) {
		char[] txt = "Hallo Welt".toUpperCase().toCharArray();
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] bsp = IO.readChars();
		for(int i = 0; i < txt.length; i++) {
			int x = a.indexOf(txt[i]);
			if(x > -1) {
				IO.print(bsp[x]);
			} else {
				IO.print(txt[i]);
			}
		}
		IO.println();
	}
}