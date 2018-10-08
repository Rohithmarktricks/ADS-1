public class Sample1 extends Thread {
	Sample1() {

	}
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Sample1 sam = new Sample1();
		sam.start();

	}
}