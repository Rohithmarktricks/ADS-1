/**
 * import Scanner class
 */
import java.util.Scanner;
/**
 * @author : Rohith.
 */
final class Solution {
    /**
     * Solution class for Insertion sort program.
     *
     */
    private Solution() {
        /**
         * { item_description }.
         */
    }
    /**
     * Main function to take inputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
    /**main method converts the given input data into
    array objects and pass as parameters to the sorting class.**/
        Scanner sc = new Scanner(System.in);
        int studentsQualified = sc.nextInt();
        int numOfvacancies = sc.nextInt();
        int unreserved_vacancies = sc.nextInt();
        int bc_vacancies = sc.nextInt();
        int sch_vacancies = sc.nextInt();
        int sct_vacancies = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.next() + "::");
        }
        String[] lines = sb.toString().split("::");
        int i = 0;
        Student[] students = new Student[lines.length];
        for (String line : lines) {
            String[] tokens = line.split(",");
            String[] date = tokens[1].split("-");
            Student student = new Student(tokens[0], date[0], date[1], date[2],
                Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
                Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), 
                tokens[6]);
            students[i++] = student;
        }
        Heap.sort(students);
        String output = "";
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
