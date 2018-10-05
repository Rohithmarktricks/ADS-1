import java.util.*;
/**
 * Class for merge sort.
 */
public class MergedSortImproved {
	/**
	 * Constructs the object.
	 */
	MergedSortImproved() {
		//unused Constructor.
	}

	// public static final int limit = 20;
	public static final int limit = 7;
	/**
	 * merge method.
	 *
	 * @param      a     { parameter_description }
	 * @param      aux   The auxiliary
	 * @param      lo    The lower
	 * @param      mid   The middle
	 * @param      hi    The higher
	 */
	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		//Precondition to check if the subArrays are sorted.
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		//Copying the values of a array into aux array.
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		//Merge back to a[] after sorting.
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if 		(i > mid) 					a[k] = aux[j++];
			else if (j > hi)					a[k] = aux[i++];
			else if (lesser(aux[j], aux[i])) 	a[k] = aux[j++];
			else 								a[k] = aux[i++];
		}


		//post condition.
		assert isSorted(a, lo, hi);
	}

	/**
	 * Sort function.
	 *
	 * @param      a     { parameter_description }
	 * @param      aux   The auxiliary
	 * @param      lo    The lower
	 * @param      hi    The higher
	 */
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		//if (hi <= lo) return;
		if (hi <= lo + limit) {
			// System.out.println(hi+","+lo);
			// System.out.println(a[hi]+","+a[lo]);
			System.out.println("Insertion sort method invoked...");
			insertionSort(a, lo, hi);
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		// call to merge can be avoided if a[mid] < a[mid+1];
		// merge(a, aux, lo, mid, hi);
		// Enhanced code is as follows.

		if (!lesser(a[mid + 1], a[mid])) {
			System.out.println("Array is already sorted. So, skipped the call to merge...");
			for (int i = lo; i <= hi; i++) {
				aux[i] = a[i];
				return;
			}
		}

		merge(a, aux, lo, mid, hi);
	}

	/**
	 * Sort function.
	 *
	 * @param      a     { parameter_description }
	 */
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
		assert isSorted(a);
	}

	/**
	 * Insertion Sort.
	 *
	 * @param      a     { parameter_description }
	 * @param      lo    The lower
	 * @param      hi    The higher
	 */
	public static void insertionSort(Comparable[] a, int lo, int hi) {
		for (int i = lo; i <= hi; i++)
			for (int j = i; j > lo && lesser(a[j], a[j - 1]); j--)
				swap(a, j, j - 1);
	}

	/**
	 * Swap method.
	 *
	 * @param      a    object
	 * @param      i    index
	 * @param      j    index
	 */
	public static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	/**
	 * To check its boolean state.
	 *
	 * @param      v     Element in a comparable.
	 * @param      w     Element in a comparable.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public static boolean lesser(Comparable v, Comparable w) {
		// System.out.println(v +","+w);
		return w.compareTo(v) > 0;
	}

	// public static boolean lesser(Object a, Object b, Comparator comparator) {
	// 	return comparator.compare(a, b) < 0;
	// }


	/**
	 * Determines if sorted.
	 *
	 * @param      a    Comparable.
	 *
	 * @return     True if sorted, False otherwise.
	 */
	public static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	/**
	 * Determines if sorted.
	 *
	 * @param      a     comparable.
	 * @param      lo    The lower
	 * @param      hi    The higher
	 *
	 * @return     True if sorted, False otherwise.
	 */
	public static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (lesser(a[i], a[i - 1])) return false;
		return true;
	}

}