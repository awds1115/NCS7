
public class BeepPrintSample {

	public static void main(String[] args) {
		Thread bt1 = new BeepTask1(); // �θ��� Thread �� �ڽ��� BeepTask1�� �θ�
		bt1.start(); // bt1�� ���� ( ������ �ڵ带 © �� )
		Thread fb1 = new Fibonacci1();
		fb1.start();
//		Runnable bt = new BeepTask(); // beeptask�� �������̽��� ����
//		Thread thread = new Thread(bt); // thread �� bt�� �־���
//		thread.start(); // �־��� thread(BeepTask)�� ���� ( ������ �ڵ带 © �� )

//		Runnable pn = new Pibonacci();
//		Thread thread1 = new Thread(pn);
//		thread1.start(); // run ȣ�� 
		for (int i = 0; i < 14; i++) {
			System.out.println("AAAAA");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
//	      for(int i=0;i<5;i++) {
//	         System.out.println("��");
//	         try {
//	            Thread.sleep(500);
//	         }catch (InterruptedException e) {}
//	      }

	}

}
