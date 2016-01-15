#!/usr/bin/env python3

import csv

print("#0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500")

def calculate_change(price,money):
	change = money - price
	coins = [ 0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500 ]
	result = []
	for coin in reversed(coins):
		if change / coin > 1:
			print("change: ", change)
			print("coin: ", coin)
			amount_of_coins = int(change / coin)
			result.append(amount_of_coins)
			change -= amount_of_coins
			print("- ", amount_of_coins)
			print(" = ", change)
		else:
			result.append(0)
	return list(reversed(result))

with open('amounts.csv', 'r') as f:
    reader = csv.reader(f)
    for row in reader:
    	price, money = row
    	print(calculate_change(float(price), float(money)))
