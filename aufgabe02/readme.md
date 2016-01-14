Aufgabe: change - Wechselgeld Berechnen
=================================

Ziel dieser Aufgabe ist es, ein möglichst kundenfreundliches (so wenig Münzen wie möglich) Wechselgeld zu brechnen . Dazu bekommt Ihr eine Datei `amounts`, in der die zurückzugebenden Beträge aufgelistet sind, das sieht zum Beispiel so aus: 
```
  4.08
  13.51
  130.02
  77.85
``` 
Ihr müsst dann pro Zeiele eure Lösung in folgendem Format zurückgeben: 
```
  #0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500;
  1,1,1,0,0,0,0,2,0,0,0,0,0,0,0;
```
*Die erste Zeile mit der Raute kann ignoriert werden und dient nur zur Infor welche Stelle der Lösung welchem Wert entspricht.*

jede Stelle entspricht dabei die Anzahl an Münzen oder Scheinen gemäß der Liste unten, beidiesem Beispiel würde die Lösung einem Betrag von 4,08€ entsprechen. Nach Ausgabe einer Lösung soll die darauf folgende in einer neuen Zeile stehen. 

Vorgaben
--------
Es liegt das Euro Münzsystem vor, also sind folgende Münztypen und Scheine vorheanden:
- Münzen:
 - 1 Cent
 - 2 Cent
 - 5 Cent
 - 10 Cent
 - 20 Cent
 - 50 Cent
 - 1 Euro
 - 2 Euro
- Scheine:
 - 5 Euro
 - 10 Euro
 - 20 Euro
 - 50 Euro
 - 100 Euro
 - 200 Euro
 - 500 Euro
 
Tipps
--------
- Ihr müsst die `amounts` Datei nicht mit Streams einlesen sondern könnt diese auch einfach in euer Programm pipen und mit IO.readDouble einlesen. Also sieht der Programmaufruf wie folgt aus: `java Programmname < amounts`

