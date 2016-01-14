#!/usr/bin/env python3

import codecs

instance = codecs.open('instanz1', 'r', 'utf-8').read().splitlines()

rows = int(instance.pop(0)) # get first item
colums = int(instance.pop(0))

row = []
for r in range(0, rows):
	for c in range(0,colums):
		col = []
		col[c] = instance.pop(0)
	row[r] = col
	print(col)

for r in range(0, rows):
	for c in range(0,colums):
		row[r][c]
