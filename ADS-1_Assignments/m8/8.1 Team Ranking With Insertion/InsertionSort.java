import java.util.*;
class InsertionSort {

	static void sort(List<Team> a) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0 && greater(a.get(j), a.get(j - 1)); j--) {
				swap(a, j, j - 1);
			}
		}
	}

	private static boolean greater(Team a, Team b) {
		return a.compareTo(b) > 0;
	}

	private static void swap(List<Team> a, int i, int j) {
		a.replace(i,j);
	}
}