import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import AlgoTools.IO;

public class VierGewinnt {

	// jaja, ist bisschen haesslich
	static int height;
	static int width;
	
	
	public static void main(String[] args) {
	
		File f = new File(args[1]);
		
		
		String[][] board = readBoard(f);
		
		
		String stein;
		int count;
		int posx;
		int posy;
		
		IO.println();
		
		for (int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				
				stein = board[i][j];
				
				if (!stein.equals("-")) {
					
					
					count = 1;

					// Horizontale
					posx = i;
					posy = j;
					// nach rechts
					while (++posx < height && posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					posx = i;
					
					// nach links
					while (--posx < height && posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					count = 1;
					
					// Vertikale
					posx = i;
					posy = j;
					// nach unten
					while (posx < height && ++posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					posy = j;
					
					// nach links
					while (posx < height && --posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					
					count = 1;
					
					
					// Diagonale 1
					posx = i;
					posy = j;
					// nach unten rechts
					while (++posx < height && ++posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					posx = i;
					posy = j;
					
					// nach oben links
					while (--posx < height && --posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					count = 1;
					
					// Diagonale 2
					posx = i;
					posy = j;
					// nach unten links
					while (++posx < height && ++posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					posx = i;
					posy = j;
					
					// nach oben rechts
					while (--posx < height && ++posy<width && posx > -1 && posy > -1 && board[posx][posy].equals(stein)) count++;
					if (count >= 4) {
						IO.println(stein);
						return;
					}
					
					
							
				}
				
				
				
				
			}

		}
		
		
		
		
	}
	
	
	public static String[][] readBoard(File filename){
		String[][] board = new String[0][0];
		
		try {
			BufferedReader stream = new BufferedReader(new FileReader(filename));
			try {
				width = Integer.parseInt(stream.readLine());
				height = Integer.parseInt(stream.readLine());
				
				board = new String[height][width];

				
				for (int i = 0; i<height;i++) {
					for (int j = 0; j<width;j++){
						String x = stream.readLine();
						board[i][j] = x;
					}
				}
				

				
				for (int i=0;i<height;i++) {
					for(int x=0;x<width;x++) {
						IO.print(board[i][x]+ " ");
					}
					IO.println();
				}
				
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return board;
		
	}
	
}
