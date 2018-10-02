/**
 * Class for insertion sort.
 */
class InsertionSort {
	/**
	 * Sorting method.
	 *
	 * @param      a     List of type Team.
	 */
	public void sort(List<Team> a) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0 && greater(a.get(j), a.get(j - 1)); j--) {
				swap(a, j, j - 1);
			}
		}
	}

	/**
	 * Greater than value function.
	 *
	 * @param      a     Team parameter.
	 * @param      b     Team parameter.
	 *
	 * @return     { description_of_the_return_value }
	 */
	private  boolean greater(Team a, Team b) {
		return a.compareTo(b) > 0;
	}

	/**
	 * Swap function.
	 *
	 * @param      a     list Team 
	 * @param      i     index
	 * @param      j     index
	 */
	private  void swap(List<Team> a, int i, int j) {
		a.replace(i, j);
	}
}