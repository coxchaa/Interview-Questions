package linkedList;

public class linkprint {

	public static void main(String[] args) {
		Node n1 = new Node("A", null);
		Node n2 = new Node("B", n1);
		Node n3 = new Node("C", n2);
		Node n4 = new Node("D", n3);
		
		new LinkedList().printListReverse(n4);

	}
	

}
