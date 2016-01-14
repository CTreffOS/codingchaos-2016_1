#!/usr/bin/env python3

import sys
import string
import codecs

chiffre_alphabet = codecs.open(str(sys.argv[1]), 'r', 'utf-8').read().splitlines()
alphabet = {}

for i in range(0, len(chiffre_alphabet)):
	alphabet[string.ascii_uppercase[i]] = chiffre_alphabet[i]
alphabet[" "] = " "

text = "HALLO WELT"

def chiffre(string):
	result = ""
	for i in range(0, len(string)):
		result += alphabet[string[i]]
	return result

print(chiffre(text))
