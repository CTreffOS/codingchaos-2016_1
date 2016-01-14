import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import AlgoTools.IO;

public class Chiffre {

	public static void main(String[] args) {
		
		
		File f = new File(args[1]);
		
		String[] a = readAlphabet(f);
		
		String vorgabe = "HALLO WELT";
		char buchstabe;
			
		
		for (int i = 0; i < vorgabe.length(); i++) {
			buchstabe = vorgabe.charAt(i);
			if (buchstabe != 32) IO.print(a[buchstabe-65]);
			else IO.print(" ");
			
		}
	}
	
	
	public static String[] readAlphabet(File filename){
		String[] a = new String[26];
		
		try {
			BufferedReader stream = new BufferedReader(new FileReader(filename));
			try {
				for (int i = 0;i<26;i++) {
					a[i] = stream.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return a;
		
	}
	
	
}
