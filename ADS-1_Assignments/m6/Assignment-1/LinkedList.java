import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
	private class Node {
		E data;
		Node next;
	}
	Node head, tail;
	int length = 0;
	public void addAtHead(E data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		if (head == null) tail = node;
		head = node;
		length++;
	}

	public void addAtTail(E data) {
		if (tail == null) {
			addAtHead(data);
			length++;
			return;
		}
		Node node = new Node();
		node.data = data;
		tail.next = node;
		tail = tail.next;
		length++;
	}

	public void reverse() {
		Node pointer = head;
		Node previous = null; 
		Node current = null;
		while (pointer != null) {
			current = pointer;
			pointer = pointer.next;
		}
	}


	public void deleteAtHead() {
		head = head.next;
		length--;
	}

	public E popAtHead() {
		E data = head.data;
		head = head.next;
		return data;
	}

	public void deleteAtTail() {
		Node thead = head;
		while (thead.next != tail)
			thead = thead.next;
		thead.next = null;
		tail = thead;
		length--;
	}

	public E popAtTail() {
		E data = tail.data;
		Node thead = head;
		while (thead.next != tail)
			thead = thead.next;
		thead.next = null;
		tail = thead;
		return data;
	}

	public void insertAfter(int index, E data) {
		Node thead = head;
		for (int i = 0; i < index; i++)
			thead = thead.next;
		Node node = new Node();
		node.data = data;
		node.next = thead.next;
		thead.next = node;
	}

	public void removeAfter(int index) {
		Node thead = head;
		for (int i = 0; i < index; i++)
			thead = thead.next;
		thead.next = thead.next.next;
	}

	public void print() {
		Node thead = head;
		while (thead != null) {
			System.out.println(thead.data);
			thead = thead.next;
		}
	}

	public Iterator<E> iterator() {
		return new MyIterator<E>(head);
	}

	private class MyIterator<E> implements Iterator<E> {
		Node current;

		public MyIterator(Node first) {
			current = first;
		}

		public boolean hasNext() {
			return current !=  null;
		}

		public void remove() {

		}

		public E next() {
			E data = (E)current.data;
			current = current.next;
			return data;
		}
	}
}