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
					System.out.println("�ֹ�����");
					order.guide();
					Scanner sm=new Scanner(System.in);
					String sxh=sm.nextLine();
					while(!sxh.equals("X")) {
						if(sxh.equals("A")){
							System.out.println("�ֹ��߰�");
							Scanner m_Menu=new Scanner(System.in);
							System.out.println("�߰��� �޴����� �Է��Ͻÿ�.");
							String Menu_name=m_Menu.nextLine();
							System.out.println();
//							order.add(Menu_name);
						}else if(sxh.equals("R")) {
							System.out.println("�ֹ�����");
						}else if(sxh.equals("U")) {
							System.out.println("�ֹ�����");
						} else if(sxh.equals("D")) {
							System.out.println("�ֹ�Ȯ��");
						}
						order.guide();
						sxh=sm.nextLine();
					}
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