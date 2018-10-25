import java.util.Scanner;
public class Solution {
    Solution() {
        //unused.
    }

    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        scan.nextLine();
        int size_ArrCost = scan.nextInt();
        scan.nextLine();
        int[] costArray = new int[size_ArrCost];
        int tempCost = 0;
        int init = 0;
        boolean flag = false;
        for (int i = 0; i < size_ArrCost; i++) {
            costArray[i] = scan.nextInt();
        }
        scan.nextLine();
        int j = 0;
        int k = 0;

        for (j = 0; j < costArray.length; j++) {
            init = costArray[j];
            for (k = 0; k < costArray.length; k++) {
                tempCost = costArray[k];
                if (init + tempCost == money ) {
                    flag = true;
                    break;
                }
            } if (flag) {
                break;
            }
        }
        if (flag) {
            System.out.println((j + 1) + " " + (k + 1));
        }

    }
}