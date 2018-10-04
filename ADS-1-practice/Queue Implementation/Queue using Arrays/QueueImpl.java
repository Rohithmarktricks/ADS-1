import java.util.Arrays;
public class QueueImpl {

	private int capacity;
	int queueArray[];
	int front = 0;
	int rear = -1;
	int currentsize = 0;

	public QueueImpl(int queueSize) {
		this.capacity = queueSize;
		queueArray = new int[this.capacity];
	}

	public void enQueue(int item) {
		if (isQueueFull()) {
			this.resize();
			System.out.println(Arrays.toString(queueArray));
		} 
		rear++;
		if (rear == capacity - 1) {
			rear = 0;
		}
		queueArray[rear] = item;
		currentsize++;
		System.out.println("Element :" + item + " is added to queue");
	
	}

	public void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Underflow, Element cannot be removed!");
		}
		front++;
		queueArray[front - 1] = 0;
		System.out.println("Removed element: " + queueArray[front - 1]);

		if (front == capacity - 1) {			
			front = 0;
		}
		currentsize--;

	}



	public void resize() {
		int[] newArray = Arrays.copyOf(queueArray, capacity * 2);
		capacity *= 2;
		rear = rear;
		queueArray = newArray;
	}

	public boolean isQueueFull() {
		boolean status = false;
		if (currentsize == capacity) {
			status = true;
		}
		return status;

	}

	public boolean isQueueEmpty() {
		boolean status = false;
		if (currentsize == 0) {
			status = true;
		}
		return status;

	}

	public static void main(final String[] args) {
		QueueImpl queue = new QueueImpl(6);
		queue.enQueue(4);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(56);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(2);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(67);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(24);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(98);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(45);
		System.out.println(Arrays.toString(queue.queueArray));
		queue.enQueue(23);
		System.out.println(Arrays.toString(queue.queueArray));
		// queue.enQueue(435);
		// queue.enQueue(23);
		// queue.enQueue(24);
		// queue.enQueue(25);
		// queue.enQueue(26);
		// queue.enQueue(27);
		// queue.enQueue(28);
		// queue.enQueue(88);
		// queue.enQueue(29);
		// queue.enQueue(30);
		// queue.enQueue(31);
		// queue.enQueue(32);
		// queue.enQueue(33);
		// queue.enQueue(34);
		// queue.enQueue(35);
		// queue.enQueue(36);
		// queue.enQueue(37);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		/*queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();*/
		System.out.println(Arrays.toString(queue.queueArray));
		System.out.println(queue.capacity);
		System.out.println(queue.currentsize);
	}
}