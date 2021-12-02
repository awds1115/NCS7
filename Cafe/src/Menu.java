import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<String> alMenu;      // �� �κп� ���๮�� �������� ���� �� ��.
	ArrayList<Integer> alPrice;
	Menu(){
		this.alMenu=new ArrayList<String>();   // ���๮�� ����ٰ� ���� ��.
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
	
	void display() {  // Ŀ�Ǹ�,���� 
		int i;
		for(i=0; i<alMenu.size(); i++) {
			System.out.println((i+1)+"."+"�޴�:"+alMenu.get(i)+" "+"����:"+alPrice.get(i));
		}
	}
	void guide() {
		System.out.println("�޴�����(X:����,C:�޴��߰�,U:�޴�����,D:�޴�����)");
	}
	void add(String menu, int price) {
		this.alMenu.add(menu);
		this.alPrice.add(price);
	}
	void update(int menu_num, String menu, int price) {
		this.alMenu.set(menu_num-1,menu);
		this.alPrice.set(menu_num-1, price);
	}
	void remove(int menu_num) {
		this.alMenu.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
	}
	void Handling() {
		this.display();
		this.guide();
		Scanner s=new Scanner(System.in);
		String sch=s.nextLine();
		while(!sch.equals("X")) {
			if(sch.equals("C")) {
				System.out.println("�޴��߰�");
				Scanner s_Menu=new Scanner(System.in);
				System.out.println("�޴����� �Է��ϼ���.");
				String nmn=s_Menu.nextLine();
				System.out.println("������ �Է��ϼ���");
				int npc=Integer.parseInt(s_Menu.nextLine());
				this.add(nmn, npc);
			
			} else if(sch.equals("U")) {
				System.out.println("�޴�����");
				Scanner s_Menu=new Scanner(System.in);
				System.out.println("������ �޴���ȣ�� �Է��ϼ���.");
				int mn=Integer.parseInt(s_Menu.nextLine());
				System.out.println("�� �޴����� �Է��ϼ���.");
				String cmn=s_Menu.nextLine();
				System.out.println("�� ������ �Է��ϼ���.");
				int cmp=Integer.parseInt(s_Menu.nextLine());
				this.update(mn, cmn, cmp);
				
			} else if(sch.equals("D")) {
				System.out.println("�޴�����");
				Scanner s_Menu=new Scanner(System.in);
				
				System.out.println("������ �޴���ȣ�� �Է��ϼ���.");
				int mrv=Integer.parseInt(s_Menu.nextLine());
				this.remove(mrv);
				
			} else {
				System.out.println("�߸��� �Է°� �Դϴ�. �ٽ� �Է����ּ���.");
			}
				this.display();
				this.guide();
				sch=s.nextLine();}
	}
}




//void display(String s) {
//for(int i=0; i<this.alMenu.size(); i++) {
//	System.out.println("�޴�:"+alMenu.get(i)+" "+"����:"+alPrice.get(i));
//}
//System.out.println(s);
//this.guide();
//}
//void display(int n) {
//for(int i=0; i<n; i++) {
//	System.out.println("�޴�:"+alMenu.get(i)+" "+"����:"+alPrice.get(i));
//}
//this.guide();
//}
	
//	int sum1(int[] values) {
//		int total=0;
//		for(int i=0; i<values.length; i++) {        // �迭�� �ҷ����� ���1
//			total+=values[i];    
//		}
//		return total;
//	}
//	int sum2(int...values) {
//		int total=0;
//		for(int i=0; i<values.length; i++) {    //  �迭�� �ҷ����� ���2
//			total+=values[i];
//		}
//		return total;
//	}


