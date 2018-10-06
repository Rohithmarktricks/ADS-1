import java.util.*;
/**
 * Class for insertion sort.
 */
class InsertionSort {
	static void sort(Comparable[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0 && less(a, j, j-1); j--) {
				swap(a, j, j-1);
			}
		}
	}
	/**
	 * { swap }
	 *
	 * @param      a     { parameter_description }
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 */
	static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

	/**
	 * { lesser. }
	 *
	 * @param      a     { parameter_description }
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	static boolean less(Comparable[] a, int i, int j) {
		return a[i].compareTo(a[j]) > 1;
	}

	// public static void main(String[] args) {
	// 	Integer[] a = {7,8,4,1,1,5,7,9};
	// 	sort(a);
	// 	System.out.println(Arrays.toString(a));
	// }
}