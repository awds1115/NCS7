
public class BeepTask implements Runnable {
	public void run() {
		for (int i = 0; i < 14; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
