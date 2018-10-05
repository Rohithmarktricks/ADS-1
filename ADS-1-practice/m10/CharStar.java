import java.util.Scanner;
/**
 * Class for character star.
 */
public class CharStar {
	CharStar() {
		//unused constructor.
	}
	/**
	 * Edits the given string by appending "*" in between repeated characters.
	 *
	 * @param      str   The string
	 *
	 * @return     { description_of_the_return_value }
	 */
	public static String editedString(final String str) {
		int n = str.length();
		if (n < 2) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + editedString(str.substring(1));
		}
		return str.charAt(0) + editedString(str.substring(1));
	}
	/**
	 * Main Method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.nextLine();
		String editedStr = editedString(str);
		System.out.println(editedStr);
	}
}