def count(num):
	if num == 0:
		return 0
	else:
		return 1 + count(num-1)

def main():
	count_to = int(raw_input("What should we count to?"))

	print count(count_to)

main()
