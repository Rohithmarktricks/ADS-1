/**
 * Class for selection sort.
 */
class SelectionSort {
	/**
	 * Sorting
	 *
	 * @param      a     List of type Team.
	 */
	public void sort(List<Team> a) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (greater(a.get(j), a.get(min))) min = j;
			}
			swap(a, i, min);
		}
	}
	/**
	 * Checks Greater.
	 *
	 * @param      a     type Team
	 * @param      b     type Team
	 *
	 * @return     boolean value.
	 */
	private  boolean greater(Team a, Team b) {
		return a.compareTo(b) > 0;
	}

	/**
	 * Swap the values.
	 *
	 * @param      a     list of type Team
	 * @param      i     int position.
	 * @param      j     int position.
	 */
	private  void swap(List<Team> a, int i, int j) {
		a.replace(i, j);
	}
}