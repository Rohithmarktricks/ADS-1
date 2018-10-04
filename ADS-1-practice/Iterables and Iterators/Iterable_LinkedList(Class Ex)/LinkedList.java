import java.util.Iterator;
import java.util.*;

//--------------------------------------------------------------
/*public class LinkedList<E> {

	private class Node {
		E data;
		Node next;
		Node () {}

		Node (E data) {
			this(data, null);
		}

		Node (E data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
	private Node head, tail;

	// LinkedList () {
	// 	head = new Node();
	// }
	//
	public void addAtHead(E data) {
		Node node = new Node();
		// if ()
		node.data = data;
		node.next = head;
		if (head == null) {
			head = node;
			tail = head;
			return;
		}

		head = node;
	}

	public E popAtHead() {
		E data = head.data;
		head = head.next;
		return data;
	}

	public void addAtTail(E data) {
		// Node thead = head;
		// while (thead != null &&  thead.next != null)
		// 	thead = thead.next;
		// thead.next = new Node(data);
		tail.next = new Node(data);
		tail = tail.next;
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
		for (int i = 0; i < index && thead != null; i++) {
			thead = thead.next;
		}
		Node node = new Node(data, thead.next);
		thead.next = node;
	}

	public void removeAfter(int index){
		Node thead = head;
		for (int i = 0; i < index && thead != null; i++) {
			thead = thead.next;*/
//--------------------------------------------------------------

public class LinkedList<E> implements Iterable<E> {

	private class Node<E> {
		E data;
		Node<E> next;
		Node () {}

		Node (E data) {
			this(data, null);
		}

		Node (E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

	}
	private Node<E> head, tail;

	// LinkedList () {
	// 	head = new Node<E>();
	// }
	//
	public void addAtHead(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = head;
		if (head == null) {
			head = node;
			tail = head;
			return;
		}

		head = node;
	}

	public E popAtHead() {
		E data = head.data;
		head = head.next;
		return data;
	}

	public void addAtTail(E data) {
		// Node<E> thead = head;
		// while (thead != null &&  thead.next != null)
		// 	thead = thead.next;
		// thead.next = new Node<E>(data);
		tail.next = new Node<E>(data);
		tail = tail.next;
	}

	public E popAtTail() {
		E data = tail.data;
		Node<E> thead = head;
		while (thead.next != tail)
			thead = thead.next;
		thead.next = null;
		tail = thead;
		return data;
	}

	public void insertAfter(int index, E data) {
		Node<E> thead = head;
		for (int i = 0; i < index && thead != null; i++) {
			thead = thead.next;
		}
		Node<E> node = new Node<E>(data, thead.next);
		thead.next = node;
	}

	public void removeAfter(int index) {
		Node<E> thead = head;
		for (int i = 0; i < index && thead != null; i++) {
			thead = thead.next;
		}
		thead.next = thead.next.next;
	}

	void print() {
		Node<E> thead = head;
		while (thead != null) {
			System.out.print(thead.data + " -> ");
			thead = thead.next;
		}
		System.out.println("null");
	}

	public Iterator<E> iterator() {
		return new MyIterator<E>(head);
	}

	private class MyIterator<E> implements Iterator<E> {
		Node<E> current;

		public MyIterator(Node<E> first) {
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



	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.addAtHead(1);
		l.addAtHead(2);
		l.addAtHead(3);
		l.addAtTail(65);

//----------------------------------------------------------------------------------
		// l.print();
		// System.out.println("--------");
		// // System.out.println(l.popAtHead());
		// System.out.println("--------");

		// l.print();
		// System.out.println("--------");

		// // System.out.println(l.popAtTail());
		// System.out.println("--------");
		// l.print();
		// System.out.println("--------");
		// // System.out.println(l.popAtTail());
		// System.out.println("--------");
		// l.print();
		// System.out.println("---------");
		// l.insertAfter(0, 5);
		// l.print();
		// l.insertAfter(2, 6);
		// l.print();

		// Integer data;
//-------------------------------------------------------------------------------

		System.out.println("	Type 1");
		for (Iterator<Integer> c = l.iterator(); c.hasNext(); System.out.println(c.next()));

		System.out.println("---------------------");
		System.out.println("	Type 2");
		for (Integer e : l)
			System.out.println(e);
		System.out.println("----------------------");
		System.out.println("	Type 3");
		Iterator<Integer> c = l.iterator();

		l.forEach(e -> System.out.println(e));
	}

}

//--------------------------------------------------------------
/*}
thead.next = thead.next.next;
}

void print() {
	Node thead = head;
	while (thead != null) {
		System.out.print(thead.data + " -> ");
		thead = thead.next;
	}
	System.out.println("null");
}

public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<>();
	l.addAtHead(1);
	l.addAtHead(2);
	l.addAtHead(3);
	l.addAtTail(65);

	l.print();
	System.out.println("--------");
	// System.out.println(l.popAtHead());
	System.out.println("--------");

	l.print();
	System.out.println("--------");

	// System.out.println(l.popAtTail());
	System.out.println("--------");
	l.print();
	System.out.println("--------");
	// System.out.println(l.popAtTail());
	System.out.println("--------");
	l.print();
	System.out.println("---------");
	l.insertAfter(0, 5);
	l.print();
	l.insertAfter(2, 6);
	l.print();
}

}*/
//--------------------------------------------------------------