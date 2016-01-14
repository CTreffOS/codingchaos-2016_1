import sys
def checkLine(b, x,y, Changes):
	#b is the board 
	#x and y are coordinates
	#Changes is a list of 6 values, that are the other fields for a row
	akt = b[x][y]
	if(akt == '-'):
		return False

	try:
		res = (b[Changes[0]+x][Changes[1]+x] == akt) and (b[Changes[2]+x][Changes[3]+x] == akt) and (b[Changes[4]+x][Changes[5]+x] == akt)
		return res
		#we found a row

	except:
		return False 



f=open(sys.argv[1])
lines=f.readlines()
board = []
for line in lines:
	board.append(line.strip());

winningConditions = [[0,1, 0,2, 0,3], # same x different y its a column
 [1,0, 2,0, 3,0], # different x same y its a line
 [1,1, 2,2, 3,3], # diagonal down right
 [1,-1, 2,-2, 3,-3]]


breite = int(board[0])
hoehe = int(board[1])
del board[0]#we dont need that
del board[0]


boardFertig=[]
for i in range(0,hoehe):
	temp = i*(breite)
	boardFertig.append(board[temp:temp+(breite)])


for x in range(0,hoehe):
	for y in range(0,breite):
		for condition in winningConditions:

			if(checkLine(boardFertig,x,y, condition)):
				print("The winner is "+ boardFertig[x][y] + " with starting point: "+str(x)+","+str(y))






#check that it is inside the field
#	if ((x<1) or (x>breite)) or ((y<1) or (y>hoehe)):
#		return 'Q' #queried cell is outsie of the field
#
#	n = (x * breite + y*hoehe-1) # poistion in the list
#	return field[n]
