/******************************  Wechselgeld.java  ****************************/

import AlgoTools.IO;

/**
 * @version 14.01.16
 *  
 * @author  nulmke
 */

public class Wechselgeld {

  public static void main(String[] argv) {
     double[] muenzen = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200, 500};
     int[] amount = new int[15];
     double eingabe = IO.readDouble("Bitte Eingeben: ");
     for(int i = 14; i >= 6; i--) {
      amount[i] = (int) eingabe / (int) muenzen[i];
      eingabe = eingabe - amount[i] * (int) muenzen[i];
     }
     eingabe = (int) Math.round(eingabe * 100.0);
     for(int i = 5; i >= 0; i--) {
      amount[i] = (int) eingabe / ((int) (muenzen[i] * 100));
      eingabe -= amount[i] * 100 * muenzen[i];
     }

     for(int i = 0; i < amount.length; i++) {
      IO.print(muenzen[i] + "  ");
     }
     IO.println();
     for(int i = 0; i < amount.length; i++) {
      IO.print(amount[i] + "   ");
     }
     IO.println();
  }
}

