import java.util.*;
// import java.util.Scanner;
public class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InsertionSort is = new InsertionSort();
		int qualified = scan.nextInt();
		int vacancies = scan.nextInt();
		int unreserved = scan.nextInt();
		int nbc = scan.nextInt();
		int nsc = scan.nextInt();
		int nst = scan.nextInt();
		Student[] student = new Student[qualified];

		for (int i = 0; i < qualified; i++) {
			String[] str = scan.next().split(",");
			String[] str2 = str[1].split("-");
			student[i] = new Student(str[0], Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2]),
			                         Integer.parseInt(str[2]), Integer.parseInt(str[3]),
			                         Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6]);
		}
		scan.close();
		is.sort(student);

		for(int i=0; i< qualified; i++){
			System.out.println(student[i].name + "," + student[i].totalMarks + "," + student[i].category);
		}
		// System.out.println(student.toString().replace("[", "").
		                   // replace("]", "").replace(", ", ","));
	}
}