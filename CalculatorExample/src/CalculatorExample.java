
public class CalculatorExample {

	public static void main(String[] args) {
		double result1=10*10*Calculator.pi;   // instance����x instance������ �����ʰ� Ŭ�����̸��� �����Ἥ �ҷ��ü� ��
		int result2=Calculator.plus(10,5);	  // ������ Ŭ������ static���� ����Ǿ��־�� ����� �����ϴ�.
		int result3=Calculator.minus(10, 5);  // final �� �������� �ٲܼ� ���� static�� ����
		
		
		System.out.println("info:"+Calculator.info);
		System.out.println("result1:"+ result1);
		System.out.println("result2:"+ result2);
		System.out.println("result3:"+ result3);
	}

}
