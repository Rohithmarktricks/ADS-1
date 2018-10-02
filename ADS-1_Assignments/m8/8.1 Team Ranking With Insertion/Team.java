/**
 * Class for team.
 */
public class Team implements Comparable{

	String countryName;
	int wins;
	int losses;
	int draws;

	/**
	 * Constructs the object.
	 *
	 * @param      name  The name
	 * @param      win   The window
	 * @param      loss  The loss
	 * @param      draw  The draw
	 */
	public Team(String name, int win, int loss, int draw) {
		countryName = name;
		wins = win;
		losses = loss;
		draws = draw;
	}

	/**
	 * CompareTo
	 *
	 * @param      object  The object
	 *
	 * @return     int value.
	 */
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
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return countryName;
	}
}