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
        String[] strTemp = number.split("");
        String once = "";
        for (int i = 0; i < strTemp.length; i++) {
            once += strTemp[strTemp.length - 1 - i];
        }
        LinkedList<Integer> ll = new LinkedList<>();
        String[] str = once.split("");
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

        int max = 0;
        int min = 0;
        int limit = 0;
        int first = list1.length;
        int second = list2.length;

        /**
         * finds maximum.
         */
        if (first - second > 0) {
            max = first;
            limit = first - second;
        } else {
            max = second;
            limit = second - first;
        }

        //padding first with 0's.
        int k = 0;
        while (k < max - first) {
            s1.push(0);
            k++;
        }
        while (first != 0) {
            Integer data = (Integer) list1.popAtHead();
            s1.push(data);
            first--;
        }

        //padding second with 0's.
        int l = 0;
        while (l < max - second) {
            s1.push(0);
            l++;
        }
        while (second != 0) {
            Integer data = (Integer) list2.popAtHead();
            s2.push(data);
            second--;
        }

        LinkedList<Integer> result1 = new LinkedList<>();
        Integer carry = 0;
        int m = 0;
        Integer sumTotal = 0;
        Integer sumPartial = 0;

        while (m <= max) {
            Integer add1 = (Integer) s1.pop();
            Integer add2 = (Integer) s2.pop();
            sumTotal = add1 + add2;
            sumPartial = (sumTotal % den) + carry;
            carry = sumTotal / den;
            result1.addAtHead(sumPartial);
            m++;
        }
        result1.addAtHead(carry);
        return result1;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
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
