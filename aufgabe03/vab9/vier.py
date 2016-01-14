# Diagonal hab ich nicht hingekriegt...

import sys
import string
import numpy

f = open(sys.argv[1], 'r')
breite = int(f.readline().strip())
hoehe = int(f.readline().strip())

feld = [[0 for x in range(hoehe)] for x in range(breite)]

for i in range(breite):
    for j in range(hoehe):
        feld[i][j] = f.readline().strip()

for reihe in feld:
    print(reihe)



for row in feld:
    points_yellow = 0
    points_red = 0
    for entry in row:
        if entry == 'Y':
            points_yellow += 1
            points_red = 0
        elif entry == 'R':
            points_red += 1
            points_yellow = 0

        if points_yellow == 4:
            print("Yellow wins!")
            sys.exit()            

        if points_red == 4:
            print("Red wins!")
            sys.exit()

for i in range(breite):
    points = 0
    for j in range(hoehe):
        entry = feld[i][j]

        if entry == 'Y':
            points_yellow += 1
            points_red = 0
        elif entry == 'R':
            points_red += 1
            points_yellow = 0

        if points_yellow == 4:
            print("Yellow wins!")
            sys.exit()            

        if points_red == 4:
            print("Red wins!")
            sys.exit()

m = numpy.matrix(feld)

for i in range(-hoehe, breite):
    diagonal = numpy.diagonal(m, i)
    points_yellow = 0
    points_red = 0
    for entry in diagonal:
        if entry == 'Y':
            points_yellow += 1
            points_red = 0
        elif entry == 'R':
            points_red += 1
            points_yellow = 0

        if points_yellow == 4:
            print("Yellow wins!")
            sys.exit()            

        if points_red == 4:
            print("UEEEH")
            print("Red wins!")
            sys.exit()



f.close()


