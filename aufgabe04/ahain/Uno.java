import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



import AlgoTools.IO;

	
	public class Uno {


	static int amount; 


	public static void main(String[] args) {
			
			
		File f = new File(args[1]);
		VerweisListe cards1 = new VerweisListe();
		VerweisListe cards2 = new VerweisListe();
		
			
		try {
			BufferedReader stream = new BufferedReader(new FileReader(f));
			try {
				amount = Integer.parseInt(stream.readLine());
				
				String line;

				int i = 0;
				line = stream.readLine();

				
				while (line != null) {

					IO.println(line);
					String[] numbers = line.split(" "); 
					
					
					cards1.insert((Integer.parseInt(numbers[0])));
					cards2.insert((Integer.parseInt(numbers[1])));

					
					line = stream.readLine();
					i++;
				} 

				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		cards1.reset();
		cards2.reset();
		
		while(!cards1.endpos()) {
			IO.print(cards1.elem()+" ");
			IO.print(cards2.elem());

			IO.println();
			cards1.advance();
			cards2.advance();
			
		}
		
		
		// ab hier wird's interessanter
		
		IO.println(playUno(cards1,cards2,-1,-1));
			

	}
		
		
	public static boolean playUno(VerweisListe l1, VerweisListe l2, int color, int number) {
		int farbe = (int) l1.elem();
		int zahl = (int) l2.elem();
		
		
		if (l1.empty()) return true;
		
		if (color == -1) {
			l1.delete();
			l2.delete();
			
			playUno(l1,l2,farbe,number);
		}
		
		
		l1.insert(farbe);
		l1.insert(zahl);
		
		do {
			l1.advance();
			l2.advance();
			farbe = (int) l1.elem();
			zahl = (int) l2.elem();
			l1.delete();
			l2.delete();
			boolean ende = l1.endpos();
			if (!ende) playUno(l1,l2,farbe,number)) return true;
			l1.insert(farbe);
			l1.insert(zahl);
		} while (!ende);
		
		return false;
		
		
		
	}
	
		


		
		
	

	
	
}
