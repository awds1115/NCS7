import java.util.Scanner;

public class Gugudan1 {

	public static void main(String[] args) {

//		for(int j=2; j<10; j++) { 111111
//		for(int i=1; i<10; i++) {
//			System.out.println(j+"x"+i+"="+(j*i));  // ������ 2�ܺ��� 9�ܱ��� 
//			
//		}
//	}
		// prompt�� ���� ���� �Է��ϴ� ���� ����� ���ؼ� 
		//Scanner s=new Scanner(System.in); �� �Ͽ� import �� ���� ��,
		//���� = s.nextInt(); �� ���ڿ��� ��쿣 Integer.parseInt(s.nextLine());
		//�� �Է��Ͽ� ����ϸ� ���� ���� �� �ִ�.
		int a=1, b=0; // ������ 3�� �ϵ��ڵ�
		Scanner s=new Scanner(System.in);
		Scanner si=new Scanner(System.in);
//		b = s.nextInt();  // �ܼ� �Է¹ޱ�. prompt �� ���� ����
		b =Integer.parseInt(s.nextLine()); // �̷��� ����ص� ��
//		int n=si.nextInt();  
		// nextInt�� nextLine �� �ϳ��� ������ ������������, 
		// ���� �ΰ��� ������ �����ؼ� �ϳ��� Int, �ϳ��� Line ���� ������ ����ϴ°��� ����.
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		a++;
		System.out.println(b+"x"+a+"="+(a*b));
		
	}
}