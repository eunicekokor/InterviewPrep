from listy import *

def get_rev(listy):
	previous = listy
	listy = listy.getNext()

	if listy.getNext() == None:
		listy.getNext() == previous
		return listy
	else:
		return get_rev(listy.getNext())
	return None

def main():
	#c = { "data":"c", "next": None }
	#b = { "data":"b", "next": c }
	#a = { "data":"a", "next": b }
	c = Listy("c",Listy("b",Listy("c",None)))
	
	print c
	#listy.append(b)
	#listy.append(c)

	print get_rev(c)

main()
