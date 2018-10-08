public class SleepThread extends Thread {
	SleepThread() {

	}

	public void run() {
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.print("Running Thread : " + Thread.currentThread().getName());
			System.out.println("Id : " + Thread.currentThread().getId());
			System.out.println(i);
		}
	}


	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		SleepThread st2 = new SleepThread();
		st.setName("Rohith");
		st2.setName("Marktricks");
		st.start();
		st2.start();
	}
}