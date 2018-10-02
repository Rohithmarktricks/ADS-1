import java.util.*;
class InsertionSort {

	static void sort(Team[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0 && greater(a[j], a[j - 1]); j--) {
				swap(a, j, j - 1);
			}
		}
	}

	private static boolean greater(Team a, Team b) {
		return a.compareTo(b) > 0;
	}

	private static void swap(Team[] a, int i, int j) {
		Team swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}