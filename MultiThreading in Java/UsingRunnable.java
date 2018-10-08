public class UsingRunnable implements Runnable {
	UsingRunnable() {
		//unused.
	}

	public void run() {
		System.out.println("I am running..........");
	}

	public static void main(String[] args) {
		UsingRunnable usr = new UsingRunnable();
		Thread t1 = new Thread(usr);
		t1.start();
	}
}