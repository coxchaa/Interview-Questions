package linkedList;

public class LinkedList {
	
	public LinkedList(){
	}
	
	public void printListReverse(Node n){
		if(n.next == null){
			System.out.println(n.data);
		}
		else{
			printListReverse(n.next);
			System.out.println(n.data);
		}
	}
}
