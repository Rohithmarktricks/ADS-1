class MyStack <E> {
	private class Node {
		E data;
		Node next;
	}
	Node head;
	int N = 0;
	void push(E data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		N++;
	}

	E pop() {
		E data = head.data;
		head = head.next;
		N--;
		return data;
	}

	int size() {
		return N;
	}

	boolean isEmpty() {
		return N == 0;
	}
}