import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Team[] dupTeams = new Team[15];
		InsertionSort is = new InsertionSort();
		int i = 0;
		while (scan.hasNext()) {
			String[] str = scan.nextLine().split(",");
			dupTeams[i++] = new Team(str[0], Integer.parseInt(str[1]),
			                    Integer.parseInt(str[2]),
			                    Integer.parseInt(str[3]));
		}
		scan.close();
		Team[] teams = new Team[i];
		for (int j = 0; j < i; j++) {
			teams[j] = dupTeams[j];
		}
		is.sort(teams);
		System.out.println(Arrays.toString(teams).replace("[", "").replace("]", "").replace(", ", ","));
	}
}