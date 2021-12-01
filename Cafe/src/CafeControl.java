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
					System.out.println("주문관리");
					order.guide();
					Scanner sm=new Scanner(System.in);
					String sxh=sm.nextLine();
					while(!sxh.equals("X")) {
						if(sxh.equals("A")){
							System.out.println("주문추가");
							Scanner m_Menu=new Scanner(System.in);
							System.out.println("추가할 메뉴명을 입력하시오.");
							String Menu_name=m_Menu.nextLine();
							System.out.println();
//							order.add(Menu_name);
						}else if(sxh.equals("R")) {
							System.out.println("주문삭제");
						}else if(sxh.equals("U")) {
							System.out.println("주문수정");
						} else if(sxh.equals("D")) {
							System.out.println("주문확인");
						}
						order.guide();
						sxh=sm.nextLine();
					}
				} else if(str.equals("S")) {
					System.out.println("실적관리");
				} else {
					System.out.println("잘못된 값입니다. 다시 입력해주세요");
				}
					System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
					str=s.nextLine();
		}
		System.out.println("프로그램을 종료합니다.");
		
	

}
}