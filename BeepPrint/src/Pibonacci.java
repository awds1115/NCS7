
public class Pibonacci implements Runnable {
	public void run() {
		int a = 1;
		int b = 1;
		for (int c = a + b; c < 1000; c = a + b) {
			System.out.println(c);
			a = b;
			b = c;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
