package linkedList;

public class Node {
	String data;
	Node next;
	
	public Node(String d, Node n){
		this.data = d;
		this.next = n;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String d) {
		this.data = d;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	
}
