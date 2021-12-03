import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	
// 모바일(mobile), 메뉴명(name), 수량(qty), 총액(sum) - 필드만들기
	//초기화(alMenu, alPrice 선언 같은거 )
	//주문추가(add) <= 메뉴명, 수량  -  총액 자동계산 
	//주문삭제(remove) <= 주문번호만 받아들여서 삭제
	//주문수정(update) <= 주문번호, 메뉴명, 수량 받아서 수정
	//주문표시(display) <= 전체주문목록 출력.
	private ArrayList<String> OrderMenu; 
	private ArrayList<Integer> alqty;
	private ArrayList<String> alMobile;
	private ArrayList<Integer>alSum;
	private Scanner s;
	private int sum;
	public Order(){	
		this.OrderMenu=new ArrayList<String>();
		this.alqty=new ArrayList<Integer>();
		this.alMobile=new ArrayList<String>();
		this.alSum=new ArrayList<Integer>();
		s=new Scanner(System.in);
	}
	private void add(String menu_name,int Menu_qty, int Menu_sum) {
		this.OrderMenu.add(menu_name);
		this.alqty.add(Menu_qty);
		this.alSum.add(Menu_sum);
	}
	private void update(Menu menu,int menu_num, int menu_num2, int qty) {
		menu_num--;
		this.OrderMenu.set(menu_num,menu.getAlMenu(orderMenu-1));
		this.alqty.set(menu_num, qty);	
		this.alSum.set(menu_num,qty*menu.getAlPrice(orderMenu-1));
		
	}
	private void remove(int menu_num) {
		menu_num--;
		this.OrderMenu.remove(menu_num);
		this.alqty.remove(menu_num);
		this.alSum.remove(menu_num);
	}
	public void display() {
		int i;
		for(i=0; i<OrderMenu.size(); i++) {
			System.out.println((i+1)+"."+"모바일:"+alMobile.get(i)+"메뉴:"+OrderMenu.get(i)+" "+"수량:"+alqty.get(i)+"총액:"+alSum.get(i));
		}
	}
	
	private void guide(){
		System.out.println("작업을 선택하시오.(X:주문종료,A:주문추가,R:주문삭제,U:주문수정)");
	
	}
	private void check() {
		int start_ndx=this.alMobile.size();
		for(int i=start_ndx; i<OrderMenu.size(); i++) {
			System.out.println((i+1)+"."+"메뉴:"+OrderMenu.get(i)+" "+"수량:"+alqty.get(i)+" 총액:"+alSum.get(i));
			}
		
	}
	private void check2() {
		int start_ndx=this.alMobile.size();
		for(int i=start_ndx; i<OrderMenu.size(); i++) {
			System.out.println("메뉴:"+OrderMenu.get(i)+" "+"수량:"+alqty.get(i)+" 총액:"+alSum.get(i));
			}
		
	}

	public void OrderHandling(Menu menu) { // 파라미터로 클래스사이의 연결을 할 수 있다.
		menu.display();
		this.guide();
		String sxh=s.nextLine();
		while(!sxh.equals("X")) {
			if(sxh.equals("A")){
				menu.display();
				System.out.println("추가할 메뉴번호를 입력하시오.");
				int Menu_number=Integer.parseInt(s.nextLine());
				String Menu_name=menu.menu.getAlMenu(orderMenu-1);
				int Menu_Price=menu.menu.getAlPrice(orderMenu-1);
				System.out.println("수량을 입력하시오.");
				int Menu_qty=Integer.parseInt(s.nextLine());
				int Menu_sum=Menu_Price*Menu_qty;
				this.add(Menu_name,Menu_qty,Menu_sum);	
				this.check2();
				
			}else if(sxh.equals("R")) {
				this.check();
				System.out.println("삭제할 메뉴번호를 입력하시오.");
				int r_menu=Integer.parseInt(s.nextLine());
				this.remove(r_menu);
				this.check();
				
			}else if(sxh.equals("U")) {
				this.check();
				System.out.println("변경할 메뉴번호를 입력하시오.");
				int udate=Integer.parseInt(s.nextLine());
				System.out.println("수정할 메뉴번호를 입력하시오.");
				int change=Integer.parseInt(s.nextLine());
				System.out.println("수량을 입력하십시오.");
				int c_qty=Integer.parseInt(s.nextLine());
				this.update(menu,udate,change,c_qty);
				this.check();
			}
			this.guide();
			sxh=s.nextLine();
		}
		System.out.println("모바일번호를 입력하시오.(없으면,'-')");
		String mobile=s.nextLine();
		if(mobile.equals(""))mobile="-";    // 제일중요 
		int start_ndx=this.alMobile.size();
		for(int i=this.alMobile.size(); i<this.OrderMenu.size(); i++){
			this.alMobile.add(mobile);
		}
		sum=0;
		for(int i=start_ndx; i<this.OrderMenu.size(); i++) {
			System.out.println(this.alMobile.get(i)+","+this.OrderMenu.get(i)+", x"+this.alqty.get(i)+","+this.alSum.get(i));
			sum+=this.alSum.get(i);
		}
		System.out.println("총 주문금액:"+sum);
		System.out.println("---------------------------");
		
	}
//	int getInput(Menu m) {
//		Scanner s_input=new Scanner(System.in);
//		m.display();
//		System.out.println("주문할 메뉴번호를 입력하시오.");
//		return Integer.parseInt(s_input.nextLine());
//	}
	
}
