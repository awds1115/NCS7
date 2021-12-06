
public class Car {
	Tire[] tires= {	new Tire(6,"앞왼쪽"),
					new Tire(2,"앞오른쪽"),
					new Tire(3,"뒤왼쪽"),   
					new Tire(4,"뒤오른쪽"),
					// 이런식으로 배열로 적용할 수도 있음
};
//	Tire frontLeft;
//	Tire frontRight;
//	Tire backLeft;
//	Tire backRight;
//	
	public Car() {
//		frontLeft = new Tire(6,"앞왼쪽");
//		frontRight = new Tire(2,"앞오른쪽");
//		backLeft = new Tire(3,"뒤왼쪽");
//		backRight = new Tire(4,"뒤오른쪽");
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0; i<tires.length; i++) {
			if(!tires[i].roll()) { stop(); return i+1;} // 배열이 반복되니 반복문으로도 적용 할 수 있음.
		} return 0;
//		if(!tires[0].roll()==false) { stop(); return 1;}
//		if(!tires[1].roll()==false) {stop(); return 2;}
//		if(!tires[2].roll()) {stop(); return 3;}  // 변수대신 배열로 적용하는법
//		if(!tires[3].roll()) {stop(); return 4;}
//		return 0;
		
//		if(frontLeft.roll()==false) { stop(); return 1;}
//		if(frontRight.roll()==false) {stop(); return 2;}
//		if(!backLeft.roll()) {stop(); return 3;}
//		if(!backRight.roll()) {stop(); return 4;}
//		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String company;   // 부모 클래스에 private 를 걸면 자식들이 상속을 받지 못한다.       
//	String model;
//	String color;
//	int nMaxSpeed;
//	int nSpeed;
//	
//	public Car() {
//		this.color="green";
//	}
//	public Car(String company, String model, String color, int nMaxSpeed, int nSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.nMaxSpeed = nMaxSpeed;
//		this.nSpeed = nSpeed;
//	}
//
//	void drive(int speed) {
//		this.nSpeed=speed;
//	}
//	void stop() {
//		this.nSpeed=0;
//	}
}
