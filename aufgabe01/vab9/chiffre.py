import sys
import string

# f = open(sys.argv[1], 'r')
# f.readline()

# text.split(",")

amount = 77.85

l = [0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200, 500]
l.reverse()
d = {}
for eintrag in l:
    d[eintrag] = 0

for i in l:
    d[i] = amount // i
    amount -= (amount // i)

l.reverse()
for x in l:
    print(d[x])

# def parse(x):
#     alphabet = {' ': ' '}
#     # text = "HALLO WELT"
#     text = "HALLO WELT"
#     f = open(x, 'r')
    
#     for i in string.ascii_uppercase:
#         line = f.readline().strip()
#         alphabet[i] = line
#     result = ""
    
#     for letter in text:
#         result += alphabet[letter]
#     print(result)

# # if __name__ == "__main__":
# parse(sys.argv[1])
#     # parse("../BeispielAlphabet.txt")
