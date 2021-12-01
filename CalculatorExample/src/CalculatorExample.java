
public class CalculatorExample {

	public static void main(String[] args) {
		double result1=10*10*Calculator.pi;   // instance생성x instance생성을 하지않고 클래스이름을 직접써서 불러올수 있
		int result2=Calculator.plus(10,5);	  // 조건은 클래스에 static으로 선언되어있어야 사용이 가능하다.
		int result3=Calculator.minus(10, 5);  // final 은 변수값을 바꿀수 없다 static은 가능
		
		
		System.out.println("info:"+Calculator.info);
		System.out.println("result1:"+ result1);
		System.out.println("result2:"+ result2);
		System.out.println("result3:"+ result3);
	}

}
