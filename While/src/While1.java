
public class While1 {

	public static void main(String[] args) {  // �� �����ߴٰ� �������� 
		int i=1; 
		int j=1;
		while(i<=10) {
			j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			} //1
			System.out.println();
			i++;
		}
		int a=0;
		int b=0;
		while(a<9) {
			b=0;
			while(b+a<=8) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
		
		
		
		
		int a1=0;     // 100������ ¦�� ��� 
		while(a1<=100) {
			System.out.println(a1);
			a1+=2;
	}

}
}
