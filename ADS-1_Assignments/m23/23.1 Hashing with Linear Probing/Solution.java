import java.util.Scanner;
public class Solution {
	Solution() {
		//unused.
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinearProbingHashST<String, Integer> hash = new LinearProbingHashST<>();
		int n = Integer.parseInt(scan.nextLine());
		while (n > 0) {
			String[] tokens = scan.nextLine().split(" ");
			switch (tokens[0]) {
			case "put":
				hash.put(tokens[1], Integer.parseInt(tokens[2]));
				break;
			case "get":
				System.out.println(hash.get(tokens[1]));
				break;
			case "delete":
				hash.delete(tokens[1]);
				break;
			case "display":
				try {
					hash.display();
				} catch (Exception e) {
					System.out.println("{}");
				}
				break;
			default:
				break;
			}
			n--;
		}
	}
}