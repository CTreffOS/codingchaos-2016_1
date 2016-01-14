import AlgoTools.IO;

public class Change {
	
	private static double[] values = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0,
										1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
	
	public static void main(String[] args) {
		do {
			double change = IO.readDouble();
			if(change <= 0) {
				IO.println("Geldbetrag war <= 0, breche ab.");
				break;
			}
			int[] count = new int[values.length];
			for(int i = 0; i < count.length && change > 0; i++) {
				while(change > values[i]) {
					count[i]++;
					change -= values[i];
				}
			}
			for(int i = values.length - 1; i >= 0; i--) {
				IO.print(count[i]);
				if(i > 0) IO.print(",");
			}
			IO.println();
		} while(true);
	}
}