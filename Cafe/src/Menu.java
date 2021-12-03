import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> alMenu;      // 이 부분에 실행문은 넣지말고 선언만 할 것.
	private ArrayList<Integer> alPrice;
	
	public String getAlMenu(int ndx) {
		return this.alMenu.get(ndx);
	}
	public int getAlPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	
	public Menu(){
		this.alMenu=new ArrayList<String>();   // 실행문은 여기다가 넣을 것.
		this.alPrice=new ArrayList<Integer>();
		File f = new File("C:\\Temp\\Menu.txt");
		   try {
		      FileReader fr = new FileReader(f);
		      BufferedReader br = new BufferedReader(fr);
		      try {
		         String line=br.readLine();
		         while(line!=null) {
		            String[]ar=line.split(",");
		            this.alMenu.add(ar[0]);
		            this.alPrice.add(Integer.parseInt(ar[1]));
		            line=br.readLine();
		         }
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		   } catch (FileNotFoundException e) {
		      e.printStackTrace();
		   }
	}
	
	public void display() {  // 커피명,가격 
		int i;
		for(i=0; i<alMenu.size(); i++) {
			System.out.println((i+1)+"."+"메뉴:"+alMenu.get(i)+" "+"가격:"+alPrice.get(i));
		}
	}
	private void guide() {
		System.out.println("메뉴관리(X:종료,C:메뉴추가,U:메뉴수정,D:메뉴삭제)");
	}
	private void add(String menu, int price) {
		this.alMenu.add(menu);
		this.alPrice.add(price);
	}
	private void update(int menu_num, String menu, int price) {
		this.alMenu.set(menu_num-1,menu);
		this.alPrice.set(menu_num-1, price);
	}
	private void remove(int menu_num) {
		this.alMenu.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
	}
	public void Handling() {
		this.display();
		this.guide();
		Scanner s=new Scanner(System.in);
		String sch=s.nextLine();
		while(!sch.equals("X")) {
			if(sch.equals("C")) {
				System.out.println("메뉴추가");
				Scanner s_Menu=new Scanner(System.in);
				System.out.println("메뉴명을 입력하세요.");
				String nmn=s_Menu.nextLine();
				System.out.println("가격을 입력하세요");
				int npc=Integer.parseInt(s_Menu.nextLine());
				this.add(nmn, npc);
			
			} else if(sch.equals("U")) {
				System.out.println("메뉴수정");
				Scanner s_Menu=new Scanner(System.in);
				System.out.println("수정할 메뉴번호를 입력하세요.");
				int mn=Integer.parseInt(s_Menu.nextLine());
				System.out.println("새 메뉴명을 입력하세요.");
				String cmn=s_Menu.nextLine();
				System.out.println("새 가격을 입력하세요.");
				int cmp=Integer.parseInt(s_Menu.nextLine());
				this.update(mn, cmn, cmp);
				
			} else if(sch.equals("D")) {
				System.out.println("메뉴삭제");
				Scanner s_Menu=new Scanner(System.in);
				
				System.out.println("삭제할 메뉴번호를 입력하세요.");
				int mrv=Integer.parseInt(s_Menu.nextLine());
				this.remove(mrv);
				
			} else {
				System.out.println("잘못된 입력값 입니다. 다시 입력해주세요.");
			}
				this.display();
				this.guide();
				sch=s.nextLine();}
	}
}




//void display(String s) {
//for(int i=0; i<this.alMenu.size(); i++) {
//	System.out.println("메뉴:"+alMenu.get(i)+" "+"가격:"+alPrice.get(i));
//}
//System.out.println(s);
//this.guide();
//}
//void display(int n) {
//for(int i=0; i<n; i++) {
//	System.out.println("메뉴:"+alMenu.get(i)+" "+"가격:"+alPrice.get(i));
//}
//this.guide();
//}
	
//	int sum1(int[] values) {
//		int total=0;
//		for(int i=0; i<values.length; i++) {        // 배열로 불러오는 방법1
//			total+=values[i];    
//		}
//		return total;
//	}
//	int sum2(int...values) {
//		int total=0;
//		for(int i=0; i<values.length; i++) {    //  배열로 불러오는 방법2
//			total+=values[i];
//		}
//		return total;
//	}


