import AlgoTools.IO;

public class Change{

	public static void main(String[] args){

		double[] change = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0, 100.0, 200.0, 500.0};

		do{

			String numbers = IO.readLine();

			if(numbers == null) break;

			String[] two = numbers.split(",");
			
			if(!numbers.contains("#")){

				double zuZahlen = Double.parseDouble(two[0]);
				double gegeben = Double.parseDouble(two[1].replace(";",""));

				double wechsel = gegeben - zuZahlen;

				if(wechsel < 0){
					IO.println("Zu wenig gegeben.");
					break;
				}

				IO.println("Wechselgeld:");
				for(int i = 14; i >= 0; i--){
					while(wechsel - change[i] > 0){
						wechsel -= change[i];
						IO.print(change[i]);
						IO.println();
					}
				}

			}

			

		}while(true);

	}
}
