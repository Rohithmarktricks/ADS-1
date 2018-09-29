import java.util.Iterator;
public class Stack<E> implements Iterable<E> {
	private class Node {
		E data;
		Node next;
	}
	private Node head;
	private int size = 0;
	public void push(E data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		size++;
	}

	public E pop() {
		E data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public int size() {
		return size;
	}

	public E peek() {
		return head.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Iterator iterator() {
		return new MyIterator(head);
	}

	private class MyIterator implements Iterator {
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
			E data = current.data;
			current = current.next;
			return data;
		}
	}

}