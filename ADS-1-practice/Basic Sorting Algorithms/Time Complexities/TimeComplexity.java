import java.util.*;
public class TimeComplexity {
	TimeComplexity() {
		//unused.
	}

	static double log(int num, int base) {
		return (double) (Math.log10(num) / Math.log10(base));
	}

	static double merg(int i) {
		return ((double) i * log(i, 2));
	}

	static double insert(int i) {
		return ((double)(i * i)) / 4;
	}

	static double select(int i) {
		return ((double) (i * i)) / 2;
	}


	public static void main(String[] args) {
		for (int i = 5; i < 50; i++) {
			if ((merg(i)  >= insert(i))||(merg(i)  >= select(i))) {
				System.out.println(i);
				System.out.println("merg: " + (float)merg(i) + "  " + "insert: " + insert(i) + "  " + "select: " + select(i));
				System.out.println("--------------------------------------------------------------------------------");
			} else {
				System.out.println("merg is fast when N >= " + i);
				System.out.println("merg: " + (float)merg(i) + "  " + "insert: " + insert(i) + "  " + "select: " + select(i));
				System.out.println("--------------------------------------------------------------------------------");
				break;
			}
		}
	}
}