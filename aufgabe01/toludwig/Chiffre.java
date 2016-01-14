import AlgoTools.IO;

public class Chiffre{
  public static void main (String[] args){
	  char c; char[] alphabet = new char[26];
    for(int i=0; i < 26; i++){
     alphabet[i] = IO.readChar("");
    }

    //char[] eingabe = IO.readChars();

    char[] eingabe = {'H','A','L','L','O',' ','W','E','L','T'};

    for(int i=0; i < eingabe.length; i++){
      if(eingabe[i] == ' ') IO.print( " ");
      else IO.print(alphabet[(int) eingabe[i] - 65]);
    }
    IO.println();
  }
}
