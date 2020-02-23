package CampingReg;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListJUnit {


	@Test
	public void TestLen(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.add("Orange");
		assertEquals(list.getLen(), 3);
	}

	@Test
	public void testGet(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.add("Orange");
		assertEquals(list.get(2), "Orange");
		assertEquals(list.get(3), null);
		assertEquals(list.get(1), "Black");
	}


	@Test
	public void TestAdd(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.add("Orange");
		assertEquals(list.getLen(), 3);
	}


	@Test
	public void TestInsertBefore(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.insertBefore(0, "apple");
		list.insertBefore(0, "pear");
		list.insertBefore(1, "peach");
		list.insertBefore(1, "cherry");
		list.insertBefore(3, "donut");
		assertEquals(list.get(0), "pear");
		assertEquals(list.get(1), "cherry");
		assertEquals(list.get(2), "peach");
		assertEquals(list.get(3), "donut");
		assertEquals(list.get(4), "apple");
	}

	@Test
	public void TestInsertAfter(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.insertAfter(0, "apple");
		list.insertAfter(0, "pear");
		list.insertAfter(1, "peach");
		list.insertAfter(1, "cherry");
		list.insertAfter(3, "donut");
		assertEquals(list.get(0), "pear");
		assertEquals(list.get(1), "apple");
		assertEquals(list.get(2), "cherry");
		assertEquals(list.get(3), "peach");
		assertEquals(list.get(4), "donut");
	}

	@Test
	public void TestDelAt1(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.delAt(1);
		assertEquals(list.get(1), null);
	}

	@Test
	public void TestDelAt2(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.add("Orange");
		list.add("Teal");
		list.add("Smurf");
		list.add("Dog");
		list.delAt(2);
		list.delAt(4);
		assertEquals(list.get(0), "Yellow");
		assertEquals(list.get(1), "Black");
		assertEquals(list.get(2), "Teal");
		assertEquals(list.get(3), "Smurf");
		assertEquals(list.get(4), null);
	}

	@Test
	public void TestRemoveTop(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.add("Orange");
		list.removeTop();
		list.removeTop();
		assertEquals(list.get(0), "Orange");
	}

	@Test
	public void TestClear(){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Yellow");
		list.add("Black");
		list.add("Orange");
		list.add("Teal");
		list.add("Smurf");
		list.add("Dog");
		list.clear();
		assertEquals(list.get(0), null);
		assertEquals(list.get(3), null);
	}




}
