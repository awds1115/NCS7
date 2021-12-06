import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Order order=new Order();
		
		Scanner s=new Scanner(System.in);
		System.out.println("프로그램 시작");
		System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
		String str=s.nextLine();
		while(str.equals("X")==false) {
			if(str.equals("M")) {
				menu.Handling();
			    } else if(str.equals("O")) {
					order.OrderHandling(menu);
				} else if(str.equals("S")) {
					order.display();
				} else {
					System.out.println("잘못된 값입니다. 다시 입력해주세요");
				}
					System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
					str=s.nextLine();
		}
		System.out.println("프로그램을 종료합니다.");
		
	

}
}