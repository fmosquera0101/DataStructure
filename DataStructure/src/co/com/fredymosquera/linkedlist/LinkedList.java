package co.com.fredymosquera.linkedlist;

/**
 * 
 * @author fredy mosqueralemus
 *
 */
public class LinkedList {
	
	private Node head;
	
	public Node getHead() {
		return head;
	}

	public void insertAtFront(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insertAtEnd(Object data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node tail = getTail();
			tail.setNext(newNode);
			newNode.setNext(null);
		}
	}

	private Node getTail() {
		Node tail = head;
		while(tail.getNext() != null) {
			tail = tail.getNext();
		}
		return tail;
	}
	public void insertBetween(Node prevNode, Object data) {
		if(prevNode == null) {
			throw new IllegalArgumentException("Argument prevNode can't be null");
		}
		Node newNode = new Node(data);
		newNode.setNext(prevNode.getNext());
		prevNode.setNext(newNode);
	}
	public void reverse() {
		
		Node current = head;
		Node prevNode = null;
		Node nextNode = null;
		
		while(null != current) {
			nextNode = current.getNext();
			current.setNext(prevNode);
			prevNode = current;
			current = nextNode;
		}
		head = prevNode;
	}
	
}
