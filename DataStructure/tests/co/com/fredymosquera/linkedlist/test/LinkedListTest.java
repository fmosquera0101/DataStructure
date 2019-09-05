package co.com.fredymosquera.linkedlist.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.com.fredymosquera.linkedlist.LinkedList;

class LinkedListTest {

	@Test
	void insertAtFrontTest() {
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtFront("1");
		linkedList.insertAtFront("2");
		linkedList.insertAtFront("3");
		assertTrue("3".equals(linkedList.getHead().getData().toString()));
	}
	
	@Test
	void insertAtEndTest() {
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtEnd("1");
		linkedList.insertAtEnd("2");
		linkedList.insertAtEnd("3");
		assertTrue("1".equals(linkedList.getHead().getData().toString()));
	}
	
	@Test
	void reverseTest() {
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtEnd("1");
		linkedList.insertAtEnd("2");
		linkedList.insertAtEnd("3");
		linkedList.reverse();
		assertTrue("3".equals(linkedList.getHead().getData().toString()));
	}

}
