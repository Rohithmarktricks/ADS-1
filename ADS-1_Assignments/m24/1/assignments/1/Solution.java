import java.util.Scanner;
public class Solution {

	Solution() {
		//unused.
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		scan.nextLine();
		SymbolTable<String, String>ST = new SymbolTable<>(inp);
		while (inp > 0) {
			String[] tokens = scan.nextLine().split(",");
			String tempToken = tokens[1] + "--" + tokens[2];
			ST.put(tokens[0], tempToken);
			inp--;
		}

		int q = scan.nextInt();
		scan.nextLine();
		String res = "";
		String[] finalRes = new String[2];
		while (q > 0) {
			String[] queries = scan.nextLine().split(" ");
			res = ST.get(queries[1]);
			int check = Integer.parseInt(queries[2]);
			if (res != null) {
				finalRes = res.split("--");
				if (check == 1) {
					System.out.println(finalRes[0]);
				} else if (check == 2) {
					System.out.println(finalRes[1]);
				}
			} else {
				System.out.println("Student doesn't exists...");
			}
			q--;
		}

	}
}

