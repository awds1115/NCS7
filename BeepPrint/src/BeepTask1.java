
public class BeepTask1 extends Thread {
	// 스레드를 상속받는 자식클래스
	@Override // run 을 Override
	public void run() {
		for (int i = 0; i < 14; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
