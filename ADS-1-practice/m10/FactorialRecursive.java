import java.util.Scanner;
/**
 * Class for factorial recursive.
 */
public class FactorialRecursive {
	/**
	 * Constructs the object.
	 */
	FactorialRecursive() {
		//unused constructor.
	}
	/**
	 * Calculates factorial of number.
	 *
	 * @param      i     { number }
	 *
	 * @return     { factorial of i }
	 */
	public static int fact(int i) {
		if (i == 1 || i == 0) {
			return 1;
		}
		return i * fact(i - 1);
	}
	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =  scan.nextInt();
		System.out.println("Factorial of " + num + " is " + ": " + fact(num));
	}
}