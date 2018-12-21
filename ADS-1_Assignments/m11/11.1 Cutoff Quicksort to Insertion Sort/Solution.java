import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for quicksort.
 */
public final class Solution {

  // private static final int CUTOFF = 10;

  /**
   * Constructs the object.
   */
  private Solution() {
    /**
     * Unused.
     */
  }
  /**
   * Main Function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    int n;
    while (sc.hasNext()) {
      n = Integer.parseInt(sc.nextLine());
      String s = sc.nextLine();
      // System.out.println(s);
      if (s.length() > 0) {
        String[] tokens = s.split(" ");
        sort(tokens, n);
        System.out.println(Arrays.toString(tokens));
      } else {
        System.out.println("[]");
      }
    }
  }

  /**
   * Sort Method.
   * Best case: O(1)
   * Average case : O(1)
   * Worst case :O(1)
   * @param      a     { parameter_description }
   * @param      n     { parameter_description }
   */
  public static void sort(final Comparable[] a, final int n) {
    sort(a, 0, a.length - 1, n);
  }

  /**
   * Sort Method.
   * Best case: O(NlogN)
   * Average case : O(NlogN)
   * Worst case :O(N^2)
   * @param      a       { parameter_description }
   * @param      lo      The lower
   * @param      hi      The higher
   * @param      cutoff  The cutoff
   */
  public static void sort(final Comparable[] a,
   final int lo, final int hi, final int cutoff) {
    if (hi <= lo + cutoff - 1) {
      insertionSort(a, lo, hi);
      return;
    }
    int j = partition(a, lo, hi);
    sort(a, lo, j - 1, cutoff);
    sort(a, j + 1, hi, cutoff);
  }

  /**
   * Insertion Sort Method.
   * Best case: O(N)
   * Average case : O(N^2/2)
   * Worst case :O(N^2)
   * @param      a     { parameter_description }
   * @param      lo    The lower
   * @param      hi    The higher
   */
  public static void insertionSort(final Comparable[] a,
   final int lo, final int hi) {
    System.out.println("insertionSort called");
    for (int i = lo; i <= hi; i++) {
      for (int j = i; j > lo; j--) {
        if (less(a[j], a[j - 1])) {
          exch(a, j, j - 1);
        }
      }
    }
    // System.out.println(Arrays.toString(a));
  }

  /**
   * Partition Method.
   * Best case: O(1)
   * Average case: O(1)
   * Worst case: O(1)
   *
   * @param      a     { parameter_description }
   * @param      lo    The lower
   * @param      hi    The higher
   *
   * @return     { description_of_the_return_value }
   */
  public static int partition(final Comparable[] a,
   final int lo, final int hi) {
    int i = lo;
    int j = hi + 1;
    Comparable v = a[lo];
    while (true) {

      while (less(a[++i], v)) {
        if (i == hi) {
          break;
        }
      }

      while (less(v, a[--j])) {
        if (j == lo) {
          break;
        }
      }

      if (i >= j) {
        break;
      }

      exch(a, i, j);
    }

    exch(a, lo, j);
    System.out.println(Arrays.toString(a));
    return j;
  }

  /**
   * Less method.
   * Best Case: O(1)
   * Average Case: O(1)
   * Worst Case: O(1)
   * @param      i     { parameter_description }
   * @param      j     { parameter_description }
   *
   * @return     { description_of_the_return_value }
   */
  public static boolean less(final Comparable i, final Comparable j) {
    return i.compareTo(j) < 0;
  }

  /**
   * Swap method to swap the two varialbles values given.
   * Best Case: O(1)
   * Average Case: O(1)
   * Worst Case: O(1)
   * @param      a     { parameter_description }
   * @param      i     { parameter_description }
   * @param      j     { parameter_description }
   */
  public static void exch(final Comparable[] a, final int i, final int j) {
    Comparable temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}

