
public class Calculator {
  static double pi=3.14159;
  
  
  static String company="LG";
  static String model="LCD";
  static String info; //1
  static {
	  info=company+"-"+model;
  }
  static int plus(int x, int y) {  // static ���� �����ϸ� �������� ó�� ����� �����ϴ�.
	  return x+y;
  }
  static int minus(int x, int y) {
	  return x-y;
  }
}
