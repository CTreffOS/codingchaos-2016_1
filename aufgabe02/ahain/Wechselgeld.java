import AlgoTools.IO;


public class Wechselgeld {

	public static void main(String[] args) {
		
		// Sorry, File lesen kriege ich nicht hin
		double betrag = IO.readDouble("Geldbetrag: ");
		

		// Geldwerte
		double[] geld = {500d,200d,100d,50d,20d,10d,5d,2d,1d,0.5,0.2,0.1,0.05,0.02,0.01};
		
		// x wird darstellen, wieviel Differenz entsteht, wenn man den Betrag modulu der jeweiligen Geldmenge rechnet
		double x;

		
		
		for (int i = 0; i<geld.length;i++) {
			// wir versuchen mit absteigend hohen Geldbetraegen zu bezahlen
			x = betrag % geld[i];
			if (x != betrag) { // bei Erfolg
				int anzahl = (int) (betrag/geld[i]);
				betrag = betrag - anzahl*geld[i];
				IO.print(anzahl);
			}
			else IO.print("0");
			if (i<geld.length-1) IO.print(",");
		}
		
		
	}
	
	
	
	
}
