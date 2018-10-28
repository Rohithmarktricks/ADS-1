import java.util.Scanner;
public class DifferentSolution {
    DifferentSolution() {
        //unused.
    }

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        scan.nextLine();
        int size_ArrCost = scan.nextInt();
        scan.nextLine();
        int tempCompareValue = 0;
        boolean value = false;
        SeparateChainingHashST<Integer, Integer> hashCream = new SeparateChainingHashST<>();
        String[] creamPrices = scan.nextLine().split(" ");
        int hc = 0;
        int ref = 0;
        for (int c = 0; c < creamPrices.length; c++) {
            if (hashCream.contains(Integer.parseInt(creamPrices[c + 1]))) {
                hashCream.put(c + 1, hashCream.get(Integer.parseInt(creamPrices[c]) + 1));
            } else {
                hashCream.put(c + 1, Integer.parseInt(creamPrices[c]));
            }
        }

        for (hc = 0; hc < creamPrices.length; hc++) {
            tempCompareValue = hashCream.get(Integer.parseInt(creamPrices[hc]));
            for (ref = 0; ref < creamPrices.length; ref++) {
                if (tempCompareValue + hashCream.get(Integer.parseInt(creamPrices[ref + 1])) == money) {
                    value = true;
                    break;
                }
            } if (value) {
                break;
            }
        }
        if (value) {
            System.out.println((hc + 1) + " " + (ref + 1));
        }

    }
}
