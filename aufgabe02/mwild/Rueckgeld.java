
import AlgoTools.IO;
public class Rueckgeld {
	public static void main(String[] argv) {
		double[] geld = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.5, 0.2,
				0.1, 0.05, 0.02, 0.01};
		double[] amounts = IO.readDoubles();
		int[] rueckgabe = new int[geld.length];
		for(int i = 0; i < amounts.length; i++) {
			for(int j = 0; j < geld.length; j++) {
				while(amounts[i] >= geld[j]) {
					rueckgabe[j]++;
					amounts[i] -= geld[j];
				}
			}
			for(int j = 0; j < geld.length; j++) {
				IO.print(rueckgabe[geld.length - 1 - j]);
				IO.print(" ");
			}
		IO.println();
		}
	}
}