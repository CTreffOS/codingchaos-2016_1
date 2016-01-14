Aufgabe: Substitutions-Chiffre
==============================

Eure Aufgabe ist es einen Text zu Chifrieren. Den als Text soll 'Hallo Welt' genommen werden. Ein sogenanntes Substutionsalphabet wird als Datei bereitgestellt.

Beispiel:

| Klartextalphabet | Substutionsalphabet |
| ---------------- | --------------------|
| A                | W                   | 
| B                | Q                   | 
| C                | T                   | 
| D                | I                   | 
| E                | O                   | 
| F                | P                   | 
| G                | Z                   | 
| H                | E                   | 
| I                | U                   |  
| J                | R                   | 
| K                | S                   | 
| L                | H                   | 
| M                | L                   | 
| N                | K                   | 
| O                | A                   | 
| P                | D                   | 
| Q                | F                   | 
| R                | G                   | 
| S                | J                   | 
| T                | X                   | 
| U                | Y                   | 
| V                | V                   | 
| W                | B                   | 
| X                | C                   | 
| Y                | M                   | 
| Z                | N                   | 


Wenn man diese Chiffre anwendet wird zum Beispiel 'HALLO WELT' zu 'EWHHA BOHX'.

Die Ausgabe soll wie volgend aussehn:
```{r, engine='sh', count_lines}
user@host$ java Chiffre < BeispielAlphabet.txt
EWHHA BOHX
```
