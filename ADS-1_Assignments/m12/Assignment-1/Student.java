public class Student implements Comparable {

	String name;
	String dob;
	int s1Marks;
	int s2Marks;
	int s3Marks;
	int totalMarks;
	String category;

	public Student(String sName, String dOB, int s1, int s2, int s3, int total, String cat) {
		name = sName;
		dob = dOB;
		s1Marks = s1;
		s2Marks = s2;
		s3Marks = s3;
		totalMarks = total;
		category = cat;

	}

	public int compareTo(Object object) {
		Student that = (Student) object;
		if (this.totalMarks > that.totalMarks) return 1;
		if (this.totalMarks < that.totalMarks) return -1;
		if (this.s3Marks > that.s3Marks) return 1;
		if (this.s3Marks < that.s3Marks) return -1;
		if (this.s2Marks > that.s2Marks) return 1;
		if (this.s2Marks < that.s2Marks) return -1;
		/*if (Integer.parseInt(this.dob[2]) > Integer.parseInt(this.dob[2])) return 1;
		if (Integer.parseInt(this.dob[2]) < Integer.parseInt(this.dob[2])) return -1;
		if (Integer.parseInt(this.dob[1]) > Integer.parseInt(this.dob[1])) return 1;
		if (Integer.parseInt(this.dob[1]) < Integer.parseInt(this.dob[1])) return -1;
		if (Integer.parseInt(this.dob[0]) > Integer.parseInt(this.dob[0])) return 1;
		if (Integer.parseInt(this.dob[0]) > Integer.parseInt(this.dob[0])) return -1;*/
		else return 0;
	}

	public String toString() {
		return name + "," + totalMarks + "," + category + "\n";
	}
}