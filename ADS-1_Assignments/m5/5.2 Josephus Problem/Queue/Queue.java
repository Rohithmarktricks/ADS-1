/**
 * Class for Queue.
 */
class Queue<E> {

	private class QNode {
		E data;
		QNode next;
	}

	QNode head;
	int count = 0;
	int removeId = 0;
	int addId = 0;

	void enQueue(E data) {
		QNode node = new QNode();
		node.data = data;
		node.next = head;
		// head = node;
		addId++;
		count++;
	}

	void deQueue() {
		E data = head.data;
		head = head.next;
		count--;
		removeId ++;
		return data;
	}
}
