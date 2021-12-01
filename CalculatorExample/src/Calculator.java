
public class Calculator {
  static double pi=3.14159;
  
  
  static String company="LG";
  static String model="LCD";
  static String info; //1
  static {
	  info=company+"-"+model;
  }
  static int plus(int x, int y) {  // static 으로 선언하면 전역변수 처럼 사용이 가능하다.
	  return x+y;
  }
  static int minus(int x, int y) {
	  return x-y;
  }
}
