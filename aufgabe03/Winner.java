import AlgoTools.IO;

public class Winner{

	public static void main(String[] argv){

		int breite = IO.readInt();
		int hoehe = IO.readInt();

		char[][] feld = new char[breite][hoehe];

		for(int i = 0; i < feld.length; i++){
			for(int j = 0; j < feld[i].length; j++){
				feld[i][j] = IO.readChar();
				IO.print(feld[i][j]);
			}
			IO.println();
		}

		boolean wonh, wonv, wond, winner;
		wonh = wonv = wond = true;
		winner = false;

		for(int i = 0; i < feld.length; i++){
			for(int j = 0; j < feld[i].length; j++){
				
				switch(feld[i][j]){

					case '-': break;

					case 'Y':
					case 'R':
						if(winner) break;

						for(int c = 1; c < 4; c++){
								if(i+c < feld.length && feld[i+c][j] != feld[i][j]){
									wonh = false;
								}
						}
						for(int c = 1; c < 4; c++){
								if(j+c < feld[i].length && feld[i][j+c] != feld[i][j]){
									wonv = false;
								}
						}
						for(int c = 1; c < 4; c++){
								if(i+c < feld.length && j+c < feld[i].length && feld[i+c][j+c] != feld[i][j]){
									wond = false;
								}
						}				



							if(wonv || wonh || wond){
								if(feld[i][j] == 'R'){
									IO.println("Rot hat gewonnen!");
									winner = true;
								}
								else if(feld[i][j] == 'Y'){
									IO.println("Gelb hat gewonnen!");
									winner = true;
								}
							}
							
							wonv = wonh = wond = true;
							break;
						
						default: throw new RuntimeException ("Ungueltiges Zeichen!");
				

			}
		}	
	  }
		if(!winner) IO.println("DRAW!");


}
}