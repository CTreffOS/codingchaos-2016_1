import AlgoTools.IO;

public class wechselgeld {
    public static void main(String []argv ){
	 double  amount = IO.readDouble("Betrag: ");
	 amount = amount*100;
	 IO.println(amount);
	 int [] geld = new int [16];
	 double fuenfer = 500000;
	 double zweier = 200000;
	 double einer = 100000;
	 int fuenf;
	 int zwei;
	 int eins;
	 
	 for (int i = 0; i< geld.length-3; i = i+3){
     
         fuenf= 0;
	 while (amount >= fuenfer){ 
		 amount = amount - fuenfer;
		 fuenf++;
	 }
        geld[i]= fuenf;
	    fuenfer = fuenfer/10;
	 
	    zwei = 0;   
	 while (amount >= zweier){
		 amount = amount - zweier;
		 zwei++;		 
	 }
	    geld[i+1] = zwei;
	    zweier = zweier/10;
	    
	    eins = 0;
      while (amount >= einer){
    	  amount = amount -einer;
    	  eins ++;
      } 
      
       geld[(i+2)] = eins; 
       einer = einer/10;
	  }
	 
	 for (int i = geld.length-1; i >0; i--){
		 IO.print(geld[i]);
		 IO.print(',');
	 }
  }
}
