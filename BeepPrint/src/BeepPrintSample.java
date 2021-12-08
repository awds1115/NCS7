
public class BeepPrintSample {

	public static void main(String[] args) {
		Thread bt1 = new BeepTask1(); // 부모인 Thread 의 자식인 BeepTask1을 부름
		bt1.start(); // bt1을 실행 ( 간단한 코드를 짤 때 )
		Thread fb1 = new Fibonacci1();
		fb1.start();
//		Runnable bt = new BeepTask(); // beeptask를 인터페이스로 생성
//		Thread thread = new Thread(bt); // thread 에 bt를 넣어줌
//		thread.start(); // 넣어준 thread(BeepTask)를 실행 ( 복잡한 코드를 짤 때 )

//		Runnable pn = new Pibonacci();
//		Thread thread1 = new Thread(pn);
//		thread1.start(); // run 호출 
		for (int i = 0; i < 14; i++) {
			System.out.println("AAAAA");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
//	      for(int i=0;i<5;i++) {
//	         System.out.println("띵");
//	         try {
//	            Thread.sleep(500);
//	         }catch (InterruptedException e) {}
//	      }

	}

}
