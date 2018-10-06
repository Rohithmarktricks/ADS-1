import java.util.*;
class InsertionSort {
	static int count = 0;
	static void sort(Comparable[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0 && less(a, j, j - 1); j--) {
				swap(a, j, j - 1);
			}
		}
	}

	static void swap(Comparable[] a, int i, int j) {
		count++;
		Comparable temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

	static boolean less(Comparable[] a, int i, int j) {
		return a[i].compareTo(a[j]) < 1;
	}


	// public static void main(String[] args) {
	// 	Integer[] a = {7,8,4,1,1,5,7,9};
	// 	sort(a);
	// 	System.out.println(Arrays.toString(a));
	// }
}