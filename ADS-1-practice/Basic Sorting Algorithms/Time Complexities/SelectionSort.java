import java.util.*;
class SelectionSort {

	static boolean less(Comparable[] a, int i, int j) {
		return a[i].compareTo(a[j]) < 0;
	}

	static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void sort(Comparable[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (less(a, j, min)) min = j;
			}
			swap(a, i, min);
		}
	}

	// public static void main(String[] args) {
	// 	String a[] = {"rat", "cat", "bat", "dog"};
	// 	sort(a);
	// 	System.out.println(Arrays.toString(a));
	// }
}
