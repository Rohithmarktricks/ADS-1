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

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.forEach(e -> System.out.println(e));
		System.out.println("---------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("-----------");
		stack.forEach(e -> System.out.println(e));
		System.out.println("-----------------");
		stack.push(4);
		stack.push(5);
		stack.forEach(e -> System.out.println(e));

	}
}