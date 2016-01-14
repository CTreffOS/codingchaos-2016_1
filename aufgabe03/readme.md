Vier Gewinnt
====


Ziel der Aufgabe
----------------

Ihr seid es leid händisch zu prüfen, wer bei vier gewinnt gewonnen hat, also
habt ihr euch dazu entschieden ein Funktion zu bauen, die das für euch prüft.
Dieser Funktion gebt ihr einen String der Form:

\<Breite\> \<Höhe\> und dann kommt zeilenweise die Belegung der Reihen.
Das könnte z.B. so aussehen:

    4 5
    ---Y
    ---Y
    R--Y
    YR-R
    RYRY

bzw.

     4
     5
     -
     -
     -
     Y
     -
     -
     -
     Y
     R
     -
     -
     Y
     Y
     R
     -
     R
     R
     Y
     R
     Y

Das `-` bedeutet, dass an dieser Stelle kein Stein liegt, das `R` bedeutet,
dass hier ein roter Stein liegt und das `Y` bedeutet, dass hier ein gelber
Stein liegt.

In dem oben stehenden Beispiel hätte die Spielerin mit den roten Steinen
gewonnen, da sie eine diagonale Linie geformt hat.


Es gelten die allgemeinen Regeln für Vier Gewinnt. Es darf also kein Stein
nicht auf einem anderen liegen oder er muss auf dem Boden liegen. Der
Spieler hat gewonnen, der zuerst vier Steine in eine Reihe gebracht hat. Dabei
ist egal ob vertikal, horizontal oder diagonal.

Was tun?
--------
Ihr schreibt ein Programm, welches als Eingabeparameter einen Pfad zu einer
Textdatei übernimmt. In dieser Textdatei steht das Muster des letzten Spiels.
Das Programm gibt dann in der Konsole aus, wer gewonnen hat (`R`oder `Y`). Sollte noch niemand
gewonnen haben, wird `D` (Draw) ausgegeben.

Ihr dürft davon ausgehen, dass ein möglicher Spielzustand vorliegt
(also, dass keine Steine in der Luft schweben oder beide Spielenden gewonnen haben).
