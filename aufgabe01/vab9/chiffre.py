import sys
import string

def parse(x):
    alphabet = {' ': ' '}
    text = "HALLO WELT"
    f = open(x, 'r')
    
    for i in string.ascii_uppercase:
        line = f.readline().strip()
        alphabet[i] = line
    result = ""
    
    for letter in text:
        result += alphabet[letter]
    print(result)

if __name__ == "__main__":
    parse(sys.argv[1])
