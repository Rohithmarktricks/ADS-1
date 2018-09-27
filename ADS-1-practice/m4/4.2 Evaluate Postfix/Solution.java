import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	Solution() {

	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyStack<Integer> stack = new MyStack<>();
		String[] str = scan.nextLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			if ((!str[i].equals("*")) && (!str[i].equals("+")) ) {
				stack.push(Integer.parseInt(str[i]));
			} else {
				int num1 = stack.pop();
				int num2 = stack.pop();
				if (str[i].equals("*")) {
					stack.push(num1 * num2);
				} else {
					stack.push(num1 + num2);
				}
			}
		}
		System.out.println(stack.pop());
	}
}