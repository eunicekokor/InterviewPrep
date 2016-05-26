def createArray(small, big, increment):
	oneArr = []
	twoArr = []

	for x in range(small,big,+increment):
		oneArr.append(x)
		if len(oneArr) == 5:
			twoArr.append(oneArr)
			oneArr = []
	return twoArr

def solution():
	arr = createArray(0, 60, 5)
	print arr
	y = len(arr[0])
	x = len(arr)

	#middle is at the position that is in the middle of the 0th and #elements in arr
	no_el = (x*y)-1
	#which row is the middle row?
	#x is total rows so (total el is x*y)
	fuck = no_el* (.5)
	print arr[int(fuck)]


solution()
