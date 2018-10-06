import java.util.*;
// import java.util.Scanner;
public class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InsertionSort is = new InsertionSort();
		int qualified = scan.nextInt();
		Student[] student = new Student[qualified];
		int vacancies = scan.nextInt();
		int unreserved = scan.nextInt();
		int nbc = scan.nextInt();
		int nsc = scan.nextInt();
		int nst = scan.nextInt();
		// System.out.println("-----------------");
		/*while (scan.hasNext()) {
			// System.out.println(Arrays.toString(str));
			student.add(new Student(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]),
			                    Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6]));

		}*/
		System.out.println("------------");
		for (int i = 0; i < qualified; i++) {
			String[] str = scan.nextLine().split(",");
			student[i] = new Student(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]),
			                         Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6]);
		}
		scan.close();
		is.sort(student);
		System.out.println(student.toString().replace("[", "").
		                   replace("]", "").replace(", ", ","));
	}
}