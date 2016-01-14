/******************************  VierGewinnt.java  ****************************/

import AlgoTools.IO;

/**
 * @version 14.01.16
 *  
 * @author  nulmke
 */

public class VierGewinnt {

  /**
  Beispieleingabe:
  4
  4
  Y---
  -Y--
  --Y-
  ---Y
  **/

  public static void main(String[] argv) {
    int breite = IO.readInt("Breite: ");
    int hoehe = IO.readInt("Hoehe: ");
    char[][] feld = new char[breite][hoehe];
    for(int j = 0; j < hoehe; j++) {
      char[] eingabe = IO.readChars("Zeile " + (j + 1) + ": ");
      for(int i = 0; i < eingabe.length; i++)
        feld[i][j] = eingabe[i];
    }
    IO.println(findeGewinner(pruefeVertikal(feld), pruefeHorizontal(feld), pruefeDiaL(feld), pruefeDiaR(feld)));
  }

  public static char pruefeVertikal(char[][] feld) {
    int wert = 0;
    for(int i = 0; i < feld.length; i++) {
      for(int j = 0; j < feld[i].length; j++) {
        if(feld[i][j] == 'Y')
          wert++;
        else if(feld[i][j] == 'R')
          wert--;
        if(wert > 3)
          return 'Y';
        if(wert < -3)
          return 'R';
      }
      if(wert > 3 || wert < -3)
        break;
    }
    return '-';
  }

  public static char pruefeHorizontal(char[][] feld) {
    int wert = 0;
    int i = 0, j = 0;
    while(j < feld[i].length && wert > -4 && wert < 4) {
      while(i < feld.length) {
        if(feld[i][j] == 'Y')
          wert++;
        else if(feld[i][j] == 'R')
          wert--;
        if(wert > 3)
          return 'Y';
        if(wert < -3)
          return 'R';
        i++;
      }
      i = 0;
      j++;
    }
    return '-';
  }

  public static char pruefeDiaL(char[][] feld) {
    int wert = 0;
    for(int i = feld.length - 1; i >= 0; i--) {
      for(int j = 0; j < feld[i].length; j++) {
        int k = i;
        int l = j;
        while(k >= 0 && l < feld[i].length) {
          if(feld[k][l] == 'Y')
            wert++;
          else if(feld[k][l] == 'R')
            wert--;
          k--;
          l++;
          if(wert > 3)
            return 'Y';
          if(wert < -3)
            return 'R';
        }
        wert = 0;
      }
    }
    return '-';
  }

  public static char pruefeDiaR(char[][] feld) {
    int wert = 0;
    for(int i = 0; i < feld.length - 3; i++) {
      for(int j = 0; j < feld[i].length; j++) {
        int k = i;
        int l = j;
        while(k < feld.length - 3 && l < feld[i].length) {
          if(feld[k][l] == 'Y')
            wert++;
          else if(feld[k][l] == 'R')
            wert--;
          k++;
          l++;
          if(wert > 3)
            return 'Y';
          if(wert < -3)
            return 'R';
        }
        wert = 0;
      }
    }
    return '-';
  }

  public static String findeGewinner(char v, char h, char dl, char dr) {
    if(v == 'R' || h == 'R' || dl == 'R' || dr == 'R')
      return "Rot hat gewonnen!";
    if(v == 'Y' || h == 'Y' || dl == 'Y' || dr == 'Y')
      return "Gelb hat gewonnen!";
    return "Niemand hat gewonnen!";
  }
}

