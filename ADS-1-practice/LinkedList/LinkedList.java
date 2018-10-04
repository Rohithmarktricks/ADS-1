/**
 * List of linkeds.
 */
class LinkedList {
	/**
	 * Head Node.
	 */
	Node head;
	/**
	 * Class for node.
	 */
	static class Node {
		String data;
		Node next;
		/**
		 * Constructs the object.
		 *
		 * @param      d     value at node.
		 */
		Node(String d) {
			data = d;
			next = null;
		}
	}
	/**
	 * Prints the data in the nodes.
	 */
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.head = new  Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;
		llist.printList();
	}
}