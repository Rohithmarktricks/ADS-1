class SelectionSort {

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


	private  boolean greater(Team a, Team b) {
		return a.compareTo(b) > 0;
	}

	private  void swap(List<Team> a, int i, int j) {
		a.replace(i, j);
	}
}