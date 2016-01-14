import sys
f=open(sys.argv[1])
lines=f.readlines()
hand = []
for line in lines:
	temp = line.strip()
	hand.append(temp.split(' '));

n = hand[0]
del hand[0]



def hinlegen(hand, alreadyPlayed):
	if(hand==[]):
		print("its done: " + str(alreadyPlayed))
		return True;

	for card in hand:
		if((alreadyPlayed == []) or (ok(card, alreadyPlayed[-1]))):
			hand.remove(card)
			alreadyPlayed.append(card)
			#print(card)
			#print(hand)
			if(hinlegen(hand,alreadyPlayed)):
				return True
			else:
				alreadyPlayed.remove(card)
				hand.append(card)
				#clean up

	return False


def ok(card1, card2):
	return ((card1[0] == card2[0]) or (card1[1] == card2[1]))


hinlegen(hand, [])