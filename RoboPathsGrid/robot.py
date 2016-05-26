def get_paths(n, m):
	# n by n; move right or down +1 only, upper left all possible paths
	print "(%r,%r)" % (n,m)
	if n == 0 or m == 0:
		# f(0) = 0
		# f(1) = 0
		return 0

	if n == 1 or m == 1:
		return 1
	
	return get_paths(n-1, m) + get_paths(n, m-1)
	'''Drawing:
	[ x12 ]
	[ 123 ]
	[ 234 ]

	'''
x, y = raw_input('What are your coordinates?').split(',')
x = int(x)
y = int(y)
print "(%r, %r)" % (x,y)
print get_paths(x, y)
