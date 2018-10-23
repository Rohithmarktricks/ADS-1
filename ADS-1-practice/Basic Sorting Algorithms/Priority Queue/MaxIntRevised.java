import java.util.*;
public class MaxIntRevised<E> extends Comparable {

	private E[] pq;
	private int n;


	/**
	 * Constructs the object.
	 *
	 * @param      capacity  The capacity
	 */
	public MaxIntRevised(int capacity) {
		pq = new E[capacity + 1];
		//n = pq.length();
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
	 * Inserts a specific int in the heap.
	 *
	 * @param      int   The int
	 */
	public void insert(E node) {
		pq[++n] = node;
		swim(n);

	}

	/**
	 * Deletes the Max E in the heap.
	 *
	 * @return     { a E. }
	 */
	public E delMax() {
		E max = pq[1];
		exchange(1, n--);
		pq[n + 1] = 0;
		sink(1);
		return max;
	}

	public int compareTo(int j) {
		if()
	}
	/**
	 * Checks which of the ints is less
	 *
	 * @param      i     { E index }
	 * @param      j     { E index }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public boolean less(E i, E j) {
		E h = pq[i];
		E l = pq[j];
		if (l > h) {
			return true;
		} return false;

	}

	/**
	 * Exchanges the ints in the correspoding indexs.
	 *
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 */
	public void exchange(E i, E j) {
		E temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;

	}

	/**
	 * to take the value to the top.
	 *
	 * @param      k     { index of the int }
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
	 * @param      k     { index of the int. }
	 */
	private void sink(int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && less(j, j + 1)) {
				j++;
			}
			if (!less(k, j)) {
				break;
			}
			exchange(k, j);
			k = j;
		}
	}

	static double log(int num, int base) {
		return (double) (Math.log10(num) / Math.log10(base));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Capacity: ");
		int i = sc.nextInt();
		MaxIntRevised<String> mx = new MaxIntRevised<>(i);
		while (i > 0) {
			System.out.print("Enter the numbers: ");
			int j = sc.nextInt();
			mx.insert(j);
			i--;
		}

		int li = mx.n;
		for (int k = 1; k < li + 1; k++) {
			System.out.println(mx.pq[k]);
		}

	}
}