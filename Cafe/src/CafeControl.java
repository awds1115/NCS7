import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Order order=new Order();
		
		Scanner s=new Scanner(System.in);
		System.out.println("���α׷� ����");
		System.out.println("�۾��� �����Ͻÿ�.(X:����,M:�޴�����,O:�ֹ�����,S:��������)");
		String str=s.nextLine();
		while(str.equals("X")==false) {
			if(str.equals("M")) {
				menu.Handling();
			    } else if(str.equals("O")) {
					order.OrderHandling(menu);
				} else if(str.equals("S")) {
					System.out.println("��������");
				} else {
					System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���");
				}
					System.out.println("�۾��� �����Ͻÿ�.(X:����,M:�޴�����,O:�ֹ�����,S:��������)");
					str=s.nextLine();
		}
		System.out.println("���α׷��� �����մϴ�.");
		
	

}
}