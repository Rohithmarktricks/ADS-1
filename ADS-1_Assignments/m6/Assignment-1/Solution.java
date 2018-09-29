import java.util.Scanner;
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {
        //unused.
    }
    /**
     * Numbers to Digits.
     *
     * @param      number  The number
     *
     * @return     Converts numbers to digits.
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList<Integer> ll = new LinkedList<>();
        String[] str = number.split("");
        for (int i = 0; i < str.length; i++) {
            ll.addAtHead(Integer.parseInt(str[i]));
        }
        return ll;
    }
    /**
     * Converts digits to Numbers.
     *
     * @param      list  The list
     *
     * @return     digits.
     */
    public static String digitsToNumber(final LinkedList list) {
        String finalStr = "";
        int j = 0;
        while (j < list.length) {
            finalStr += list.popAtHead();
            j++;
        }
        return finalStr;
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return    Linkedlist.
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
            final LinkedList list2) {
        final int den = 10;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        int k = 0;
        while (k < list1.length) {
            Integer data = (Integer) list1.popAtHead();
            s1.push(data);
        }

        int l = 0;
        while (l < list2.length) {
            Integer data = (Integer) list2.popAtHead();
            s2.push(data);
        }

        LinkedList<Integer> result1 = new LinkedList<>();
        Integer remaining = 0;
        int m = 0;
        while (m < k) {
            Integer add1 = (Integer) s1.pop();
            Integer add2 = (Integer) s2.pop();
            Integer sum1 = add1 + add2;
            Integer parRes = sum1 % den + remaining;
            remaining = sum1 / den;
            result1.addAtTail(parRes);
            m++;
        }
        return result1;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    private Solution(){
        //unused.
    }
    /**
     * Main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
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
            LinkedList result =
                AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default:
            break;
        }
    }

}
