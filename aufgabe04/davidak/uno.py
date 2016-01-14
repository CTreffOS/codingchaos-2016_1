#!/usr/bin/env python3

import sys
import codecs

numbers = range(1, 8)
colors = range(1, 5)

hand = codecs.open(str(sys.argv[1]), 'r', 'utf-8').read().splitlines()
cards = hand.pop(0)

print(cards)
print(hand)

def get_lowest_number():
	for i in numbers:
		print("Number: ", i)
		for k in hand:
			number, color = k.split()
			print("Number: " + number + " Color: " + color)
			if i == int(number):
				lowest_num = k
				break
			if lowest_num:
				break
		if lowest_num:
			break
	for k in hand:
		number, color = k.split()
		if number == lowest_num.split()[0]:
			if color < lowest_num.split()[1]:
				lowest_num = k
	print(lowest_num)

def get_lowest_color():
	pass

get_lowest_number()
