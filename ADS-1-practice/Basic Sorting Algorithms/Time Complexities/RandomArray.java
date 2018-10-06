import java.util.*;

public class RandomArray {
	RandomArray() {
		//unused constructor.
	}

	static Random rand = new Random();

	public static Comparable[] newArray(int num) {
		Comparable[] arr = new Integer[num];
		for (int i = 0; i < num; i++) {
			arr[i] = rand.nextInt();
		}
		return arr;
	}

	public static int getRange(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		int num = getRange(42, 50);
		Comparable[] arr = newArray(num);
		Comparable[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println("Size : " + num);
		System.out.println("Input Array");
		System.out.println("------------");
		// System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("Insertion Sort");
		long startTime = System.nanoTime();
		InsertionSort.sort(arr);
		// System.out.println(Arrays.toString(arr));
		double seconds = (double)(System.nanoTime() - startTime) / 1000000000.0;
		System.out.println();
		System.out.println("Time : " + seconds);
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("Merge Sort");
		long startTime1 = System.nanoTime();
		MergeSort.sort(arr);
		// System.out.println(Arrays.toString(arr));
		double seconds1 = (double)(System.nanoTime() - startTime1) / 1000000000.0;
		System.out.println();
		System.out.println("Time : " + seconds1);
		System.out.println("-----------------------------------");
		if (seconds1 >= seconds) {
			System.out.println("Insertion sort outperforms");
			System.out.println(seconds1 - seconds);
		} else {
			System.out.println("Merge Sort outperforms");
			System.out.println(seconds - seconds1);
		}


	}

}