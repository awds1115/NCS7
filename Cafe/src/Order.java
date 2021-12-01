import java.util.ArrayList;

public class Order {
	
// 모바일(mobile), 메뉴명(name), 수량(qty), 총액(sum) - 필드만들기
	//초기화(alMenu, alPrice 선언 같은거 )
	//주문추가(add) <= 메뉴명, 수량  -  총액 자동계산 
	//주문삭제(remove) <= 주문번호만 받아들여서 삭제
	//주문수정(update) <= 주문번호, 메뉴명, 수량 받아서 수정
	//주문표시(display) <= 전체주문목록 출력.
	ArrayList<String> alMenu; 
	ArrayList<Integer> alqty;
	ArrayList<String> alMobile;
	ArrayList<Integer>alSum;
	Order(){	//1
		this.alMenu=new ArrayList<String>();
		this.alqty=new ArrayList<Integer>();
		this.alMobile=new ArrayList<String>();
		this.alSum=new ArrayList<Integer>();
	}
	void add(String menu, int qty, String mobile, int sum) {
		this.alMenu.add(menu);
		this.alqty.add(qty);
		this.alMobile.add(mobile);
		this.alSum.add(sum);
	}
	void update(int menu_num, String menu, int qty, String mobile, int sum) {
		this.alMenu.set(menu_num-1,menu);
		this.alqty.set(menu_num-1, qty);
		this.alMobile.set(menu_num-1, mobile);
		this.alSum.set(menu_num-1,sum);
	}
	void remove(int menu_num) {
		this.alMenu.remove(menu_num-1);
		this.alqty.remove(menu_num-1);
		this.alMobile.remove(menu_num-1);
		this.alSum.remove(menu_num-1);
	}
	void display() {
		int i;
		for(i=0; i<alMenu.size(); i++) {
			System.out.println((i+1)+"."+"모바일:"+alMobile.get(i)+"메뉴:"+alMenu.get(i)+" "+"수량:"+alqty.get(i)+"총액:"+alSum.get(i));
		}
	}
	
	void guide(){
		System.out.println("작업을 선택하시오.(X:종료,A:주문추가,R:주문삭제,U:주문수정,D:주문확인)");
	
	}
}
