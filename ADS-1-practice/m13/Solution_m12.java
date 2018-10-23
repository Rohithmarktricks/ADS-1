import java.util.Scanner;
import java.util.*;


class Seat {

  String studentName, reservationCategory;

  int sub1Marks, sub2Marks, sub3Marks, totalMarks, date, month, year;

  Seat(String name, int[] dOB, int s1m, int s2m, int s3m, int tm, String rc) {

    studentName = name;
    date = dOB[0];
    month = dOB[1];
    year = dOB[2];
    sub1Marks = s1m;
    sub2Marks = s2m;
    sub3Marks = s3m;
    totalMarks = tm;
    reservationCategory = rc;
  }

  public String getRC() {
    return reservationCategory;
  }

  public String toString() {
    return studentName + "," + totalMarks + "," + reservationCategory;
  }
}

class CustomComparator implements Comparator<Seat> {
  public int compare(Seat seat1, Seat seat2) {
    if (seat1.totalMarks > seat2.totalMarks) {
      return 1;
    }
    if (seat1.totalMarks < seat2.totalMarks) {
      return -1;
    }
    if (seat1.sub3Marks > seat2.sub3Marks) {
      return 1;
    }
    if (seat1.sub3Marks < seat2.sub3Marks) {
      return -1;
    }
    if (seat1.sub2Marks > seat2.sub2Marks) {
      return 1;
    }
    if (seat1.sub2Marks < seat2.sub2Marks) {
      return -1;
    }
    if (seat1.year > seat2.year) {
      return 1;
    }
    if (seat1.year < seat2.year) {
      return -1;
    }
    if (seat1.month > seat2.month) {
      // System.out.println("reached");
      return 1;
    }
    if (seat1.month < seat2.month) {
      // System.out.println("reached1");
      return -1;
    }
    if (seat1.date > seat2.date) {
      return 1;
    }
    if (seat1.date < seat2.date) {
      return -1;
    }
    return 0;
  }
}

class Insertionsort <E> {

  void sort(E[] a, Comparator comparator) {
    int size = a.length;
    for (int i = 0; i < size; i++) {
      for (int j = i; j > 0; j--) {
        if (more(a[j], a[j - 1], comparator)) {
          swap(a, j, j - 1);
        }
      }
    }
    // System.out.println(Arrays.toString(a));
  }




  void swap(E[] a, int i, int j) {
    E temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  boolean more(E a, E b, Comparator comparator) {
    return comparator.compare(a, b) > 0;
  }



}

public class Solution_m12 {

  private Solution_m12() {

  }



  public static void seatAllotment(Seat[] a, int vac, int open, int bc, int sc, int st) {
    Insertionsort<Seat> insertion = new Insertionsort<>();
    insertion.sort(a, new CustomComparator());
    // System.out.println(Arrays.toString(a));
    String s = "";
    for (int j = 0; j < a.length; j++) {
      s += a[j].toString() + "\n";
    }
    System.out.println(s);

    int count = 0, countBC = 0, countSC = 0, countST = 0;
    for (int m = 0; m < a.length; m++) {

      if (a[m].getRC().equals("ST")) {
        countST += 1;
      } else if (a[m].getRC().equals("SC")) {
        countSC += 1;
      } else if (a[m].getRC().equals("BC")) {
        countBC += 1;
      }
    }
    // System.out.println(countBC);
    // System.out.println(countST);
    // System.out.println(countSC);
    Seat[] b = new Seat[vac];
    for (int i = 0; i < a.length; i++) {
      if (count < open) {
        if (a[i].getRC().equals("ST")) {
          b[count++] = a[i];
          countST--;
        } else if (a[i].getRC().equals("SC")) {
          b[count++] = a[i];
          countSC--;
        } else if (a[i].getRC().equals("BC")) {
          b[count++] = a[i];
          countBC--;
        } else {
          b[count++] = a[i];
        }

      }  else {
        if (a[i].getRC().equals("ST") && st != 0) {
          b[count++] = a[i];
          st --;
          countST--;
        } else if (a[i].getRC().equals("SC") && sc != 0) {
          b[count++] = a[i];
          sc --;
          countSC--;
        } else if (a[i].getRC().equals("BC") && bc != 0) {
          if (!Arrays.asList(b).contains(a[i]));
          b[count++] = a[i];
          bc--;
          countBC--;
        } //else if (bc != 0 && countBC == 0) {
        //     // System.out.println("Reached1");
        //     b[count++] = a[i];
        //     bc--;
        // } else if (sc != 0 && countSC == 0) {
        //   // System.out.println("reached2");
        //     b[count++] = a[i];
        //     sc--;
        // } else if (st != 0 && countST == 0) {
        //   // System.out.println("reached3");
        //     b[count++] = a[i];
        //     st--;
        // }
      }
    }

    if (count <= vac) {
      for (int l = open; l < a.length; l++) {
        if (bc != 0 && !Arrays.asList(b).contains(a[l])) {
          b[count++] = a[l];
          bc--;
        } else if (sc != 0 && !Arrays.asList(b).contains(a[l])) {
          b[count++] = a[l];
          sc--;
        } else if (st  != 0 && !Arrays.asList(b).contains(a[l])) {
          b[count++] = a[l];
          st--;
        }
      }
    }
    insertion.sort(b, new CustomComparator());
    // System.out.println(Arrays.toString(b));
    String s1 = "";
    for (int k = 0; k < b.length; k++) {
      s1 += b[k].toString() + "\n";
    }
    System.out.println(s1);
  }

  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Seat[] a = new Seat[n];
    int size = 0;
    int vacancies = Integer.parseInt(sc.nextLine());
    int urcv = Integer.parseInt(sc.nextLine());
    int bcv = Integer.parseInt(sc.nextLine());
    int scv = Integer.parseInt(sc.nextLine());
    int stv = Integer.parseInt(sc.nextLine());

    while (sc.hasNext()) {

      String[] tokens = sc.nextLine().split(",");
      String[] dateOfbirth = tokens[1].split("-");
      int[] dateOfbirth1 = new int[dateOfbirth.length];
      for (int i = 0; i < dateOfbirth.length; i++) {
        dateOfbirth1[i] = Integer.parseInt(dateOfbirth[i]);
      }
      a[size++] = new Seat(tokens[0], dateOfbirth1,
                           Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
                           Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), tokens[6]);
    }
    sc.close();
    seatAllotment(a, vacancies, urcv, bcv, scv, stv);
  }

}