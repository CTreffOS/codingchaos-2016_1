import sys
import string

# f = open(sys.argv[1], 'r')
# f.readline()

# text.split(",")
eingabe = input("Gib eine Zahl ein... bitte: ")

amount = float(eingabe)


l = [0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200, 500]
l.reverse()
d = {}
for eintrag in l:
    d[eintrag] = 0

for i in l:
    
    if amount < 0:
        break
    anzahl = amount // i
    d[i] = int(anzahl)
    amount -= (anzahl*i)

l.reverse()
print(l)
for x in l:
    print d[x], 