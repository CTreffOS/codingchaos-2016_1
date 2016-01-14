import sys
import csv

def getReturnMoney(howMuch):
	geld = [500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01]
	output = [0,  0,  0, 0, 0, 0,0,0,0,  0,  0,  0,   0,   0,   0]
	index = 0

	while(howMuch >= 0.01):#because float is fucked up
		#print(output)
		#print(howMuch)
		if(howMuch>=geld[index]):
			howMuch -= geld[index]
			output[index] += 1
		else:
			index += 1

	output.reverse()
	return output

#geld = [0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500]
#geld = [500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01]

with open("amounts.csv", 'r') as csvfile:
	am = csv.reader(csvfile, delimiter=',', quotechar=';')
	amounts = list(am)
	del amounts[0]
	for row in amounts:
		toReturn = float(row[1].strip(';'))-float(row[0])
		print(toReturn)
		#print([0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500])
		wechselGeld = getReturnMoney(toReturn)
		print(wechselGeld)
		
		#print(wechselGeld)








