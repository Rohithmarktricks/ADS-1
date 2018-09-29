import java.util.Scanner;
class AddLargeNumbers {

	public static LinkedList numberToDigits(String number) {
		LinkedList<Integer> ll = new LinkedList<>();
		String[] str = number.split("");
		for (int i = 0; i < str.length; i++) {
			ll.addAtHead(Integer.parseInt(str[i]));
		}
		return ll;
	}

	public static String digitsToNumber(LinkedList list) {
		String finalStr = "";
		int j = 0;
		while (j < list.length) {
			finalStr += list.popAtHead();
			j++;
		}
		return finalStr;
	}

	public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		MyStack<Integer> s1 = new MyStack<>();
		MyStack<Integer> s2 = new MyStack<>();

		int k = 0;
		while (k < list1.length) {
			Integer data = (Integer)list1.popAtHead();
			s1.push(data);
		}

		int l = 0;
		while (l < list2.length) {
			Integer data = (Integer)list2.popAtHead();
			s2.push(data);
		}

		LinkedList<Integer> result1 = new LinkedList<>();
		Integer remaining = 0;
		int m = 0;
		while (m < k) {
			Integer add1 = (Integer)s1.pop();
			Integer add2 = (Integer)s2.pop();
			Integer sum1 = add1 + add2;
			Integer parRes = sum1 ;
			//% 10 + remaining
			//remaining = sum1 / 10;
			result1.addAtHead(parRes);
			m++;
		}
		return result1;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":
			LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		case "addLargeNumbers":
			pDigits = AddLargeNumbers.numberToDigits(p);
			qDigits = AddLargeNumbers.numberToDigits(q);
			LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
			System.out.println(AddLargeNumbers.digitsToNumber(result));
			break;
		}
	}

}
