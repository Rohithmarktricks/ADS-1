import java.util.*;
/**
 * Class for merge sort.
 */
public class MergeSort {
	/**
	 * Constructs the object.
	 */
	MergeSort() {
		//unused Constructor.
	}
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
			if 		(i > mid) 				a[k] = aux[j++];
			else if (j > hi)				a[k] = aux[i++];
			else if (less(aux[j], aux[i])) 	a[k] = aux[j++];
			else 							a[k] = aux[i++];
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
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
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
		// assert isSorted(a);
	}

	/**
	 * To check its boolean state.
	 *
	 * @param      v     Element in a comparable.
	 * @param      w     Element in a comparable.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}


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
			if (less(a[i], a[i - 1])) return false;
		return true;
	}

	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		String[] a = {"India", "Australia", "England", "America", "Brazil", "Computer", "Laptop"};
		MergeSort.sort(a);
		System.out.println(Arrays.toString(a));
	}
}