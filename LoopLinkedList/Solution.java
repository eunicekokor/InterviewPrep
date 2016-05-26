public class Solution{
	public static boolean hasLoop(LinkedListNode[] list){
		for (int i = 0; i< list.length; i++){
			list[i].get();
		}

		LinkedListNode fast = list[0];
		LinkedListNode slow = list[0];

		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			System.out.print("Fast: ");
			fast.get();
			System.out.print("Slow: ");
			slow.get();
			if (slow == fast){
				return true;
			}
		}

		return false;

	}

	public static LinkedListNode[] makeLoop(){
		LinkedListNode[] myList = new LinkedListNode[10];
		for (int i = 0; i < myList.length; i++){
			myList[i] = new LinkedListNode(i);
			if (i > 0){
				myList[i-1].next = myList[i];
			}
		}
		System.out.println("Created");
	return myList;
	}

	public static void main(String[] args){
		LinkedListNode[] mylist =  makeLoop();
		mylist[5].next = mylist[0];
		if (!hasLoop(mylist)){
			System.out.println("No loop Congrats");
		}
		else{
			System.out.println("You have a loop");
		}
	}


}

