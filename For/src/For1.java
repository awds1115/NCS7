
public class For1 {

	public static void main(String[] args) {
		for(int j=2; j<10; j++) { 
		for(int i=1; i<10; i++) {
			System.out.println(j+"x"+i+"="+(j*i));  // 구구단 2단부터 9단까지 	
		}
	}
	
	
		
		for(int x=1; x<=10; x++) {
		for(int i=0; i<x; i++) {    // 별 피라미드로 찎기 
			System.out.print("*"); 
		}
		System.out.println("");	
	}
	for(int x=9; x>=1; x--) {
		for(int i=0; i<x; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
		
	
	
	
	for(int i=3,j; i<=24541; i++) {    // 2000까지의 소수 구하기 
		for(j=2; j<=i; j++) {
			if(i%j==0) break;
		}
		if(i==j) System.out.println(i+"는 소수 입니다.");	
	}
	
	
}

}
