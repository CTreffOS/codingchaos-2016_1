import AlgoTools.IO;
public class viergewinnt {
	public static char gewinner(){
	    char[][]brett = leseEingabe();
	    
		for(int i=0;i<brett.length;i++){
			for(int j=0;j<brett[i].length;j++){
				if(j<(brett[i].length-4)&&brett[i][j]==brett[i][j+1]&&brett[i][j+1]==brett[i][j+2]&&brett[i][j+2]==brett[i][j+3]&&brett[i][j]=='R'){
				 return ('R');	
				}
				if(j<(brett[i].length-4)&&brett[i][j]==brett[i][j+1]&&brett[i][j+1]==brett[i][j+2]&&brett[i][j+2]==brett[i][j+3]&&brett[i][j]=='Y'){
			      return('Y');
				}
			    if(i<(brett.length-4)&&brett[i][j]==brett[i][j-1]&&brett[i][j-1]==brett[i][j-2]&&brett[i][j-2]==brett[i][j-3]){
			      if (brett[i][j] == 'R')return('R');
			      else if (brett[i][j]== 'Y') return ('Y');
			    }
			    if(i<(brett.length-4)&&j<(brett[i].length-4)&&brett[i][j]==brett[i+1][j+1]&&brett[i+1][j+1]==brett[i+2][j+2]&&brett[i+2][j+2]==brett[i+3][j+4]){
			    	if(brett[i][j]=='R')return ('R');
			    	if(brett[i][j]== 'Y')return ('Y');
			    }
			    if(i>4 && j>4 && brett[i][j]==brett[i-1][j-1]&&brett[i-1][j-1]==brett[i-2][j-2]&&brett[i-2][j-2]==brett[i-3][j-3]){
			        if(brett[i][j]=='R')return ('R');
			        if(brett[i][j]=='Y')return('Y');
			    }
		  }	
	           return('D');
		}
	}	
     public static char[][] leseEingabe(){
		   int breite = IO.readInt("breite:");
		   int laenge = IO.readInt('laenge:");
		   char[][] out = new char[laenge][breite];
		   for(int i=0; i< breite.length; i++){
			   out[i]= IO.readChars();
		   }
		   
		   
	   }
	  public static void main(String [] argv){
		  char gewinner = gewinner();
		 IO.println(gewinner);
	  }
	}
