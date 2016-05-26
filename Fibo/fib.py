def getNthFib(n):
	# 1 1 2 3 5 8 13 21
	# 8
	if n <= 0:
		return 0 #f(0) = 0, if it's not in the seq, can't add it
	if n == 1:
		return 1 #f(1) = 1, fib seq's first no is always 1
	elif n > 1:
		fib = getNthFib(n-1) + getNthFib(n-2)
	else:
		return "Error. You probably didn't use a number"
	return fib


def main():
	nth = int(input("> "))
	print getNthFib(nth)

main()
