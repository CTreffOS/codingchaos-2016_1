import AlgoTools.IO;


public class Wechselgeld{
  public static void main(String[] args){
    double[] coins = {0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500};
    

    double d = 0;
      d = IO.readDouble("Bitte zu wechselnden Wert: (Abbruch mit <0) ");
      
      IO.print("#");
      
      for(int i=0; i <= 14; i++){
        IO.print(coins[i] + "\t ");
      }
      IO.println();

      int[] ausgabe = new int[15];
    while(d>0.0) {
      for(int i=14; i >= 0; i--){
      int f;
      f = (int) (d/coins[i]);
      ausgabe[i] = f;
      d = d%coins[i];
      }
      for(int i=0; i <= 14; i++){
      IO.print(ausgabe[i] + "\t ");
      }
      IO.println();
      d = IO.readDouble("Bitte zu wechselnden Wert: (Abbruch mit <0) ");
    }
  }
}
