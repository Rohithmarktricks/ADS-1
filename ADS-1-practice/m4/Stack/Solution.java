import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	private Solution() {

	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("//home//rohith//Documents//ADS-1//ADS-1-practice//m4//Stack//sampleTest.txt");
		Scanner scan = new Scanner(file);
		scan.useDelimiter("\\Z");
		MyStack<String> stack = new MyStack<>();
		String[] str = scan.next().split(" ");
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals("-")) {
				stack.push(str[i]);
			} else if (!stack.isEmpty()) {
				System.out.println(stack.pop() + " ");
			}
		}
		System.out.println("-------------");
		System.out.println(stack.pop());
	}
}
