public class Team implements Comparable{

	String countryName;
	int wins;
	int losses;
	int draws;

	public Team(String name, int win, int loss, int draw) {
		countryName = name;
		wins = win;
		losses = loss;
		draws = draw;
	}

	public int compareTo(Object object) {
		Team that = (Team) object;
		if (this.wins > that.wins) return 1;
		if (this.wins < that.wins) return -1;
		if (this.losses < that.losses) return 1;
		if (this.losses > that.losses) return -1;
		if (this.draws < that.draws) return -1;
		if (this.draws > that.draws) return 1;
		else return 0;
	}

	public String toString() {
		return countryName;
	}
}