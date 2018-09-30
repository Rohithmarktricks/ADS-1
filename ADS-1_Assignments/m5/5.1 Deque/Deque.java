import java.util.Iterator;
public class Deque<E> implements Iterable<E> {
	private class Node {
		E data;
		Node next;
		Node() {
			//unused Constructor.
		}
		Node(E data) {
			this.data = data;
		}
		Node(E data, Node nextNode) {
			this.data = data;
			this.next = nextNode;
		}
	}
	Deque() {
		//unused constructor.
	}
	Node head, tail;
	int size;
	public void pushLeft(E data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
			size++;
			return;
		}
		Node node = new Node(data, head);
		head = node;
		size++;
	}
	public void pushRight(E data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
			size++;
			return;
		}
		Node node = new Node(data, null);
		tail.next = node;
		tail = node;
		size++;
	}
	public int getSize() {
		return size;
	}
	public E popLeft() {
		if (head != null) {
			Node temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
		System.out.println("Deck is empty");
		return null;
	}
	public E popRight() {
		if (head != null) {
			Node temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			E element = temp.next.data;
			temp.next = null;
			tail = temp;
			size--;
			return element;
		} else {
			System.out.println("Deck is empty");
			return null;
		}
	}
	public boolean isEmpty() {
		return size == 0;
	}
	/*public String toString() {
		if (head != null) {
			String str = "[";
			Node realHead = head;
			while (realHead.next != null) {
				str += (realHead.data) + ", ";
				realHead = realHead.next;
			};
			str += (realHead.data) + "]";
			return str;
		} else {
			return "[]";
		}
	}*/

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