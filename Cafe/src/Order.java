import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	
// �����(mobile), �޴���(name), ����(qty), �Ѿ�(sum) - �ʵ常���
	//�ʱ�ȭ(alMenu, alPrice ���� ������ )
	//�ֹ��߰�(add) <= �޴���, ����  -  �Ѿ� �ڵ���� 
	//�ֹ�����(remove) <= �ֹ���ȣ�� �޾Ƶ鿩�� ����
	//�ֹ�����(update) <= �ֹ���ȣ, �޴���, ���� �޾Ƽ� ����
	//�ֹ�ǥ��(display) <= ��ü�ֹ���� ���.
	ArrayList<String> OrderMenu; 
	ArrayList<Integer> alqty;
	ArrayList<String> alMobile;
	ArrayList<Integer>alSum;
	Scanner s;
	int sum;
	Order(){	
		this.OrderMenu=new ArrayList<String>();
		this.alqty=new ArrayList<Integer>();
		this.alMobile=new ArrayList<String>();
		this.alSum=new ArrayList<Integer>();
		s=new Scanner(System.in);
	}
	void add(String menu_name,int Menu_qty, int Menu_sum) {
		this.OrderMenu.add(menu_name);
		this.alqty.add(Menu_qty);
		this.alSum.add(Menu_sum);
	}
	void update(Menu menu,int menu_num, int menu_num2, int qty) {
		menu_num--;
		this.OrderMenu.set(menu_num,menu.alMenu.get(menu_num2-1));
		this.alqty.set(menu_num, qty);	
		this.alSum.set(menu_num,qty*menu.alPrice.get(menu_num));
		
	}
	void remove(int menu_num) {
		menu_num--;
		this.OrderMenu.remove(menu_num);
		this.alqty.remove(menu_num);
		this.alSum.remove(menu_num);
	}
	void display() {
		int i;
		for(i=0; i<OrderMenu.size(); i++) {
			System.out.println((i+1)+"."+"�����:"+alMobile.get(i)+"�޴�:"+OrderMenu.get(i)+" "+"����:"+alqty.get(i)+"�Ѿ�:"+alSum.get(i));
		}
	}
	
	void guide(){
		System.out.println("�۾��� �����Ͻÿ�.(X:�ֹ�����,A:�ֹ��߰�,R:�ֹ�����,U:�ֹ�����)");
	
	}
	void check() {
		int start_ndx=this.alMobile.size();
		for(int i=start_ndx; i<OrderMenu.size(); i++) {
			System.out.println((i+1)+"."+"�޴�:"+OrderMenu.get(i)+" "+"����:"+alqty.get(i)+" �Ѿ�:"+alSum.get(i));
			}
		
	}
	void check2() {
		int start_ndx=this.alMobile.size();
		for(int i=start_ndx; i<OrderMenu.size(); i++) {
			System.out.println("�޴�:"+OrderMenu.get(i)+" "+"����:"+alqty.get(i)+" �Ѿ�:"+alSum.get(i));
			}
		
	}

	void OrderHandling(Menu menu) { // �Ķ���ͷ� Ŭ���������� ������ �� �� �ִ�.
		menu.display();
		this.guide();
		String sxh=s.nextLine();
		while(!sxh.equals("X")) {
			if(sxh.equals("A")){
				menu.display();
				System.out.println("�߰��� �޴���ȣ�� �Է��Ͻÿ�.");
				int Menu_number=Integer.parseInt(s.nextLine());
				String Menu_name=menu.alMenu.get(Menu_number-1);
				int Menu_Price=menu.alPrice.get(Menu_number-1);
				System.out.println("������ �Է��Ͻÿ�.");
				int Menu_qty=Integer.parseInt(s.nextLine());
				int Menu_sum=Menu_Price*Menu_qty;
				this.add(Menu_name,Menu_qty,Menu_sum);	
				this.check2();
				
			}else if(sxh.equals("R")) {
				this.check();
				System.out.println("������ �޴���ȣ�� �Է��Ͻÿ�.");
				int r_menu=Integer.parseInt(s.nextLine());
				this.remove(r_menu);
				this.check();
				
			}else if(sxh.equals("U")) {
				this.check();
				System.out.println("������ �޴���ȣ�� �Է��Ͻÿ�.");
				int udate=Integer.parseInt(s.nextLine());
				System.out.println("������ �޴���ȣ�� �Է��Ͻÿ�.");
				int change=Integer.parseInt(s.nextLine());
				System.out.println("������ �Է��Ͻʽÿ�.");
				int c_qty=Integer.parseInt(s.nextLine());
				this.update(menu,udate,change,c_qty);
				this.check();
			}
			this.guide();
			sxh=s.nextLine();
		}
		System.out.println("����Ϲ�ȣ�� �Է��Ͻÿ�.(������,'-')");
		String mobile=s.nextLine();
		if(mobile.equals(""))mobile="-";    // �����߿� 
		int start_ndx=this.alMobile.size();
		for(int i=this.alMobile.size(); i<this.OrderMenu.size(); i++){
			this.alMobile.add(mobile);
		}
		sum=0;
		for(int i=start_ndx; i<this.OrderMenu.size(); i++) {
			System.out.println(this.alMobile.get(i)+","+this.OrderMenu.get(i)+", x"+this.alqty.get(i)+","+this.alSum.get(i));
			sum+=this.alSum.get(i);
		}
		System.out.println("�� �ֹ��ݾ�:"+sum);
		System.out.println("---------------------------");
		
	}
//	int getInput(Menu m) {
//		Scanner s_input=new Scanner(System.in);
//		m.display();
//		System.out.println("�ֹ��� �޴���ȣ�� �Է��Ͻÿ�.");
//		return Integer.parseInt(s_input.nextLine());
//	}
	
}
