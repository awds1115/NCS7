import java.util.ArrayList;

public class Order {
	
// �����(mobile), �޴���(name), ����(qty), �Ѿ�(sum) - �ʵ常���
	//�ʱ�ȭ(alMenu, alPrice ���� ������ )
	//�ֹ��߰�(add) <= �޴���, ����  -  �Ѿ� �ڵ���� 
	//�ֹ�����(remove) <= �ֹ���ȣ�� �޾Ƶ鿩�� ����
	//�ֹ�����(update) <= �ֹ���ȣ, �޴���, ���� �޾Ƽ� ����
	//�ֹ�ǥ��(display) <= ��ü�ֹ���� ���.
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
			System.out.println((i+1)+"."+"�����:"+alMobile.get(i)+"�޴�:"+alMenu.get(i)+" "+"����:"+alqty.get(i)+"�Ѿ�:"+alSum.get(i));
		}
	}
	
	void guide(){
		System.out.println("�۾��� �����Ͻÿ�.(X:����,A:�ֹ��߰�,R:�ֹ�����,U:�ֹ�����,D:�ֹ�Ȯ��)");
	
	}
}
