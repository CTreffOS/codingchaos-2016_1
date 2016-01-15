
import sys

def spielen(hand, h):
    h.remove(hand)
    if len(h) == 0:
        return hand
    else: 
        for i in range(0, len(h)):
            if kann_legen(hand, h[i]):
                print(h)
                return .append(spielen(h[i], h))
                



def kann_legen(hand1, hand2):
    return hand1[0] == hand2[0] or hand1[1] == hand2[1]

f = open(sys.argv[1], 'r')
anzahl = int(f.readline().strip())
liste = []
for i in range(anzahl):
    line = f.readline().strip()
    liste.append(list(line.split()))
f.close()

# for i in range(len(liste)):


# print(liste)

print(spielen(liste[0], liste))





