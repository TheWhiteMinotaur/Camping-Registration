package CampingReg;

/**********************************************************************
 * This class is a user created LinkedList 
 * @author Kevin Smith
 *
 * @param <E>
 *********************************************************************/
public class MyLinkedList<E> {
	private Node<E> top;
	private Node<E> tail;

	/******************************************************************
	 * Constructor that sets the top and tail of the linked list
	 * to null
	 *****************************************************************/
	public MyLinkedList() {
		top = null;
		tail = null;
	}
	/******************************************************************
	 *
	 * Determines the size, that is, the number of elements 
	 * in the list.
	 *
	 * @return the size of the list
	 *
	 *****************************************************************/
	public int getLen() {
		int length = 0;
		Node<E> temp = top;
		for(temp = top; temp!=null; temp=temp.getNext()){
			length++;
		}
		return length;
	}
	/******************************************************************
	 *
	 * Inserts a Node before a specific index. When the list is empty
	 * that is, top = null, then the index must be 0. After the first
	 * element is added, index must be: 0 <= index < size of list
	 *
	 * @param index a specific index into the list.
	 * @param data stores the information for each Node
	 *
	 *****************************************************************/
	public void insertBefore(int index, E data) {
		Node<E> temp = new Node<E>();
		// case 0, no list
		if (top == null && getLen() == 0) {
			top = new Node<E>();
			top.setData(data);
			top.setNext(null);
			return;
		}
		// case 1, there is a list
		if(getLen() == 1) {
			temp.setData(data);
			temp.setNext(top);
			top = temp;
			return;
		}
		// case 2, there is a list
		if(getLen() > 1) {
			temp = top;
			for (int inc = 1; inc < index; inc++)
				temp = temp.getNext();
			temp.setNext(new Node<E>(data, temp.getNext()));
			return;
		}
	}
	/******************************************************************
	 *
	 * Inserts a Node after a specific index. When the list is empty
	 * that is, top = null, then the index must be 0. After the first
	 * element is added, index must be: 0 <= index < size of list.
	 *
	 * @param index a specific index into the list.
	 * 
	 *****************************************************************/
	public void insertAfter(int index, E data) {
		Node<E> temp = new Node<E>();
		// case 0, no list
		if (top == null && getLen() == 0) {
			top = new Node<E>();
			top.setData(data);
			top.setNext(null);
			return;
		}
		// case 1, there is a list
		if(getLen() == 1) {
			temp.setData(data);
			temp.setNext(top);
			top = temp;
			return;
		}
		// case 2, there is a list
		if(getLen() > 1) {
			temp = top;
			for (int inc = 0; inc < index; inc++)
				temp = temp.getNext();
			temp.setNext(new Node<E>(data, temp.getNext()));
			return;
		}
	}
	/******************************************************************
	 * Removes the top of a list.
	 *****************************************************************/
	public void removeTop() {
		top = top.getNext();
	}
	/******************************************************************
	 *
	 * This Method removes a Node at the specific index position. The
	 * first node is index 0.
	 *
	 * @param index the position in the linked list that is to be removed.
	 * The first position is zero.
	 *
	 *****************************************************************/
	public void delAt(int index) {
		if (index > getLen() - 1 || index < 0) {
			System.out.println("Index out of bounds.");
		}
		else if (index == 0)
			top = null;
		else if (index == getLen())
			tail = null;
		else if (index == 0 && getLen() == 1) {
			top = null;
			tail = null;
		}
		else if (getLen() == 0)
			System.out.println("Index out of bounds exception.");
		else {
			int currentIndex = 0;
			Node<E> temp = top;

			while (temp != null) {
				if (currentIndex + 1 == index) {
					temp.setNext(temp.getNext().getNext());
					return;
				}
				temp = temp.getNext();
				currentIndex++;
			}
		}
	}
	/******************************************************************
	 * Gets a node from the specified index.
	 * @param index a specific index into the list.
	 * @return the Node from the specified index.
	 *****************************************************************/
	public E get(int index) {
		// Index larger than list
		if (index >= getLen()) {
			return null;
		}
		// Find specific index
		Node<E> temp = new Node<E>();
		temp = top;
		for (int inc = 0; inc < index; inc++)
			temp = temp.getNext();

		return temp.getData();
	}
	/******************************************************************
	 * Adds a Node to a list with user specified information.
	 * @param data the information that each Node stores.
	 *****************************************************************/
	public void add(E data) {
		// temp node to add
		Node<E> temp = new Node<E>();
		// case 0, no list
		if (top == null && getLen() == 0) {
			top = new Node<E>();
			top.setData(data);
			top.setNext(null);
			return;
		}
		// case 1, one item in the list
		if (top.getNext() == null) {
			temp.setData(data);
			temp.setNext(null);
			top.setNext(temp);
			return;
		}
		// case 2, multi-item list. Moves down the list
		temp = top;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new Node<E>(data, null));
		return;
	}
	/******************************************************************
	 * Clears all the Nodes in a list so that the list 
	 * is equal to null.
	 *****************************************************************/
	public void clear() {
		top = null;
		tail = null;

	}
	/******************************************************************
	 * Displays the information each list has stored. 
	 *****************************************************************/
	public void display() {
		Node<E> temp = top;

		System.out.println ("___________ List ________________________");
		while (temp != null) {
			System.out.println (temp.getData());
			temp = temp.getNext();
		}
	}
}