/******************************  Chiffre.java  ********************************/

import AlgoTools.IO;

/**
 * @version 14.01.16
 *  
 * @author  nulmke
 */

public class Chiffre {

  public static void main(String[] argv) {
     char[] alphabet = IO.readChars("Bitte Alphabet eingeben: ");
     char[] key = {'H', 'A', 'L', 'L', 'O', ' ', 'W', 'E', 'L', 'T'};
     int[] pos = getLetterPositions(key);
     char[] result = new char[key.length];
     for(int i = 0; i < pos.length; i++) {
      if(pos[i] == 26)
        result[i] = ' ';
      else result[i] = alphabet[pos[i]];
     }
     for(int i = 0; i < result.length; i++) {
      IO.print(result[i]);
     }
  }

  public static int[] getLetterPositions(char[] key) {
    char current;
    int pos;
    int[] result = new int[key.length];
    char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    for(int i = 0; i < key.length; i++) {
      current = key[i];
      if(current == ' ')
        result[i] = 26;
      else {
        pos = 0;
        while(alphabet[pos] != current)
          pos++;
        result[i] = pos;
      }
    }
    return result;
  }
}

