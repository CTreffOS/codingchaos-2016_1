f=open('BeispielAlphabet.txt')
lines=f.readlines()
chifre=[]

for line in lines:
	chifre.append(line[0])


s= input("zu Verschluesseln: ")
normal = s.lower();
output = ''

for character in normal:
	if(character == ' '):
		output += ' '
	else:
		index = ord(character)-ord('a')
		output += chifre[index]

print(output)

