public class LinkedListNode
{
	LinkedListNode next;
	int data;

	public LinkedListNode(int d){
		next = null;
		data = d;
	}

	public LinkedListNode getNext(){
		return this.next;
	}

	public int getData(){
		return this.data;
	}

	public void get(){
		System.out.println("Current Node: " + data);
		if (next == null){
			System.out.println("Next Node is Null");
		}
		else {
			System.out.println("Next Node: " + next.data);
		}
	}

}

