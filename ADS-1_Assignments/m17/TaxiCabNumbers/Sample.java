import java.util.Scanner;
// Most inefficient!!!
public class Sample {
	private Sample() {
		//unused.
	}
	public static void calTaxiNum(int num, int times) {
		int i = 0, count = 0;
		int n_times = times;
		while (count < num) {
			int count_val = 0;
			for (int j = 1; j <= Math.pow(i, 1.0 / 3); j++)
				for (int k = j + 1; k <= Math.pow(i, 1.0 / 3); k++)
					if (j * j * j + k * k * k == i)
						count_val++;

			if (count_val == n_times) {
				count++;
				if (count == num)
					System.out.println(count + " " + i);
			}

			i++;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		calTaxiNum(N, M);

	}
}