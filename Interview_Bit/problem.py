import numpy as np

def rectangle(A):
	size = (2*A)-1
	row = []
	final = []
	for i in range(0, size):
		for j in range(0, size):
			row.append(A)
		print row
		final.append(row)
		row = []
	print "\n\n Final:\n"
	print final

	#for x in final
	# return final

def delve(A):
	size = (2*A) - 1
	array = np.zeros([size, size])
	for x in range(0, size):
		for y in range(0,size):
			repeat(A, x, y, size, array)
	return np.array_str(array)

def repeat(A, x, y, size, array):
	if y == 0 or y == size - 1:
		array[x][y] = A
	if x == 0 or x == size - 1:
		array[x][y] = A
	else:
		repeat(A-1, x, y, size-1, array)



def main():
	print "Enter a num you want to be immortalized"
	cool_num = int(input(">_ "))
	#print rectangle(cool_num)
	print delve(cool_num)

main()
