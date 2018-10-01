/**
 * Class for steque.
 *
 * @param      <E>   Generic class.
 */
public class Steque<E> {
	/**
	 * Class for node.
	 */
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

	private Node head, tail;
	int size = 0;

	/**
	 * Push data from begining of the steque.
	 *
	 * @param      data  The data
	 */
	public void push(E data) {
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

	/**
	 * enqueue data - push data from end of the steque.
	 *
	 * @param      data  The data
	 */
	public void enqueue(E data) {
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


	/**
	 * Gets the size.
	 *
	 * @return     The size.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Pop method.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public E pop() {
		if (head != null) {
			Node remove = head;
			head = head.next;
			size--;
			return remove.data;
		}
		System.out.println("Steque is empty.");
		return null;
	}

	public String toString() {
		if (head != null) {
			String str = "";
			Node realHead = head;
			while (realHead.next != null) {
				str += (realHead.data) + ", ";
				realHead = realHead.next;
			};
			str += (realHead.data);
			return str;
		} else {
			return "steque is empty.";
		}
	}

}