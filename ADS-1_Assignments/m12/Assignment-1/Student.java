public class Student implements Comparable {

	String name;
	int dod;
	int dom;
	int doy;
	int s1Marks;
	int s2Marks;
	int s3Marks;
	int totalMarks;
	String category;

	public Student(String sName, int doB, int doM, int doY, int s1, int s2, int s3, int total, String cat) {
		name = sName;
		dod = doB;
		dom = doM;
		doy = doY;
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
		if (this.doy < that.doy) return 1;
		if (this.doy > that.doy) return -1;
		if ((this.doy == that.doy) && (this.dom < that.dom)) return 1;
		if ((this.doy == that.doy) && (this.dom > that.dom)) return -1;
		if ((this.doy == that.doy) && (this.dod < that.dod)) return 1;
		if ((this.doy == that.doy) && (this.dod > that.dod)) return -1;
		else return 0;
	}

	public String toString() {
		return name + "," + totalMarks + "," + category + "\n";
	}
}