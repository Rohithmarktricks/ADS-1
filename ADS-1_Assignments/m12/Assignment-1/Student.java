/**
 * Class for student.
 */
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
    /**
     * Constructs the object.
     *
     * @param      sName  The s name
     * @param      doB    The do b
     * @param      doM    The do m
     * @param      doY    The do y
     * @param      s1     The s 1
     * @param      s2     The s 2
     * @param      s3     The s 3
     * @param      total  The total
     * @param      cat    The cat
     */
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

    /**
     * CompareTo method.
     *
     * @param      object  The object
     *
     * @return     { integer }
     */
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
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return name + "," + totalMarks + "," + category + "\n";
    }
}