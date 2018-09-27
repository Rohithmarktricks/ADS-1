import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused constructor
  }

  /**
   * Main function.
   * Returns the combinational number of equal pairs in the given array.
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int arraySIZE = scan.nextInt();
    int size = 0;
    int[] inputArray = new int[arraySIZE];
    for (int i = 0; i < arraySIZE; i++) {
      inputArray[size] = scan.nextInt();
      size += 1;
    }

    int count = 0;
    int sum = 0;
    Arrays.sort(inputArray);
    for (int i = 0; i < inputArray.length - 1; i++) {
      if (inputArray[i] == inputArray[i + 1]) {
        count += 1;
      } else {
        sum += (count * (count + 1)) / 2;
        count = 0;
      }

      if (i == inputArray.length - 2) {
        sum += (count * (count + 1)) / 2;
      }
    }

    System.out.println("The number of equal pairs in the input are: "
                       + sum);
  }
}
