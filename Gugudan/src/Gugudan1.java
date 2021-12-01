import java.util.Scanner;

public class Gugudan1 {

	public static void main(String[] args) {

//		for(int j=2; j<10; j++) { 111111
//		for(int i=1; i<10; i++) {
//			System.out.println(j+"x"+i+"="+(j*i));  // 구구단 2단부터 9단까지 
//			
//		}
//	}
		// prompt와 같이 값을 입력하는 란을 만들기 위해선 
		//Scanner s=new Scanner(System.in); 을 하여 import 를 누른 후,
		//변수 = s.nextInt(); 나 문자열인 경우엔 Integer.parseInt(s.nextLine());
		//를 입력하여 출력하면 값을 넣을 수 있다.
		int a=1, b=0; // 구구단 3단 하드코딩
		Scanner s=new Scanner(System.in);
		Scanner si=new Scanner(System.in);
//		b = s.nextInt();  // 단수 입력받기. prompt 와 같은 개념
		b =Integer.parseInt(s.nextLine()); // 이렇게 사용해도 됨
//		int n=si.nextInt();  
		// nextInt와 nextLine 을 하나의 값으로 나눠쓰지말고, 
		// 차라리 두개의 변수를 선언해서 하나는 Int, 하나는 Line 으로 나눠서 사용하는것이 좋다.
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