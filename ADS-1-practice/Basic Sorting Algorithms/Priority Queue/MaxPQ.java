public class MaxPQ<Key extends Comparable<Key>> {

	private Key[] pq;
	private int n;

	/**
	 * Constructs the object.
	 *
	 * @param      capacity  The capacity
	 */
	public MaxPQ(int capacity) {
		pq = (Key[]) new Comparable[capacity + 1];
	}

	/**
	 * Determines if empty.
	 *
	 * @return     True if empty, False otherwise.
	 */
	public boolean isEmpty() {
		return n == 0;
	}

	/**
	 * Inserts a specific key in the heap.
	 *
	 * @param      key   The key
	 */
	public void insert(Key node) {
		pq[++n] = node;
		swim(n);

	}

	/**
	 * Deletes the Max key in the heap.
	 *
	 * @return     { a key. }
	 */
	public Key delMax() {
		Key max = pq[1];
		swap(1. n--);
		pq[n + 1] = null;
		sink(1);
		return max;
	}

	/**
	 * Checks which of the keys is less
	 *
	 * @param      i     { key index }
	 * @param      j     { key index }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public boolean less(int i, int j) {

	}

	/**
	 * Exchanges the keys in the correspoding indexs.
	 *
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 */
	public void exchange(int i, int j) {

	}

	/**
	 * to take the value to the top.
	 *
	 * @param      k     { index of the key }
	 */
	private void swim(int k) {
		while (k > 1 && less (k / 2, k)) {
			exchange(k, k / 2);
			k = k / 2;
		}
	}

	/**
	 * To take the value to the branches.
	 *
	 * @param      k     { index of the key. }
	 */
	private void sink(int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < N && less(j, j + 1)) {
				j++;
			}
			if (!less(k, j)) {
				break;
			}
			exchange(k, j);
			k = j;
		}
	}



}