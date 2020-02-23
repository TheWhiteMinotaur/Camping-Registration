package CampingReg;

public class Node<E> {
	
	private E data;
	private Node next;

	public Node(E data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node() {
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}
}


