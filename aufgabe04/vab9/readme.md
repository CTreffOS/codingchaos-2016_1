Uno
=================================

Aufgabe:
--------
Der König von Osnabrück hat Langeweile und beschließt deshalb mit sich selbst UNO zu spielen.
Er nimmt einige Karten auf die Hand und versucht alle Karten hintereinander abzulegen.
Dabei hält er die UNO Regeln ein und legt in jeder Runde nur eine Karte,
die entweder die gleiche Farbe oder die gleiche Zahl hat, wie die letzte gelegte Karte.	
Eine Karte wird als (color,number) dargestellt, wobei die Farben durchnummeriert sind.
Eine mögliche Karte wäre also (2,3). Danach dürfte eine (2,4) oder eine (3,3) gelegt werden,
da dort die Farbe bzw. Zahl übereinstimmen, aber nicht eine (3,2), (5,6)
oder gar eine (7,7), da jeweils sowohl die Farbe als auch die Zahl eine andere ist,
als bei der letzten gelegten Karte (2,3).
Es gibt die 7 Nummern von 1 bis 7 und 4 Farben 1 bis 4.

Vorgabe:
-----
Es werden euch verschiedene Hände gegeben und eure Aufgabe ist es heraus zu finden,
ob der König es hinkriegt alle Karten hintereinander zu legen und,
falls dies der Fall ist, wie die Reihenfolge ist.
Eine mögliche Hand wäre:
	
    7
    1 0
    3 4
    1 3
    5 1
    1 1
    1 1
    6 2
    
7 ist die Anzahl der Karten die danach übergeben werden.

 
Falls sich jemand dafür interessiert, hier ein Paper dazu:
[The Complexity of UNO von Demaine et al.](http://arxiv.org/pdf/1003.2851.pdf)
