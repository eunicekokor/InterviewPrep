class Listy:
	def __init__(self, data, nextthing):
		self.data = data
		self.nextthing = nextthing

	def getNext(self):
		if self.nextthing:
			return self.nextthing
		else:
			return None
