/******************************  VierGewinnt.java  ****************************/

import AlgoTools.IO;

/**
 * @version 14.01.16
 *  
 * @author  toludwig
 */

public class VierGewinnt {

  public static void main(String[] argv) {
    char ausgang='D';
    char[][] spielfeld;
    int k=IO.readInt();   // spalte
    int i=IO.readInt();  // zeile
    spielfeld = new char[i][k];

    for(int j=0; j<i; j++) {
      for(int l=0; l<k; l++) {
        spielfeld[j][l]= IO.readChar();
      }
    }
    int zaehler=0; 
    for(int j=i-1; j>=0; j--) {
      for(int l=k-1; l>=0;  l--) {
        char temp;        
        temp = spielfeld[j][l];
        
        if((l-4)>=0) { 
          for(int o=1; o<4; o++) {
            if(temp == spielfeld[j][l-o]) zaehler ++;
          }
          if(zaehler==4) {
            ausgang =temp;
            break;
          }
          else ausgang = 'D';
          zaehler=0;
        }

        if( (j-4) >=0 ) {
          for(int o=1; o<4; o++) {
            if(temp == spielfeld[j-o][l]) zaehler ++;
          }
          if(zaehler==4) {
            ausgang =temp;
            break;
          }
          else ausgang = 'D';
          zaehler=0;
        }

        if( (j-4)>=0 && (l-4)>=0) {
          for(int o=1; o<4; o++) {
            if(temp == spielfeld[j-o][l-o]) zaehler ++;
          }
          if(zaehler==4) {
            ausgang =temp;
            break;
          }
          else ausgang = 'D';
          zaehler=0;
        }


        if( (j+4)>=i && (l-4)>=0) {
          for(int o=1; o<4; o++){
            if(temp == spielfeld[j+o][l-o]) zaehler ++;
          }
          if(zaehler==4) {
            ausgang =temp;
            break;
          }

          else ausgang = 'D';
          zaehler=0;
        }


      }
    }

    IO.println(ausgang);

  }
}

