list = List()
stuff = List("stuff", list)

stuff.isEmpty() = false
list.isEmpty() = true

stuff.getData() = "stuff"
stuff.getNext() = List()

abcList = List("a", List("b", List("c", List()))).getNext() = ["b", "c"]
aList = List("a", List()) = ["a"]

Define reverse(abcList) = List("c", List("b", List("a", List())))

=> ["c", "b", "a"]

public List reverse(List someList){
	    List reversed_list = [];
		    // First method is to call getNext() on abcList until there is only one element that is returned
			    // List("a", List("b", (List("c", List())))
				    
					    List pointer = someList;
						    // List nextpointer = someList.getNext();
							    // When pointer.getNext().isEmpty()
								    // reversed_list.append(pointer)
									    
										    while (!pointer.isEmpty()){
												        if (pointer.getNext().isEmpty()){
															            reversed_list.append(pointer);
																		            reverse(pointer);
																					        }
																							        pointer = pointer.getNext();
																									        // nextpointer = nextpointer.getNext();
																											    }
																												    
																													    reversed_list.append(pointer);
